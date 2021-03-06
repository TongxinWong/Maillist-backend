package com.lw.maillist.controller;



import com.lw.maillist.grammar.*;
import com.lw.maillist.util.EmailVerfication;
import okhttp3.OkHttpClient;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class BaseController {

    @PostMapping("/emailParse")
    public Maillist Parse(@RequestBody OriginMaillist originMaillist){
        String listStr = originMaillist.getOriginMaillist();
        //System.out.println("输入的字符串" + listStr);
        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream input = new ANTLRInputStream(listStr);
        // 用 in 构造词法分析器 lexer，词法分析的作用是将字符聚集成单词或者符号
        MaillistLexer lexer = new MaillistLexer(input);
        lexer.removeErrorListeners();
        MyLexErrorListener myLexErrorListener = new MyLexErrorListener();
        lexer.addErrorListener(myLexErrorListener);
        // 用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 再使用 tokens 构造语法分析器 至此parser,已经完成词法分析和语法分析的准备工作
        MaillistParser parser = new MaillistParser(tokens);
        parser.removeErrorListeners();
        MyParseErrorListener myParseErrorListener = new MyParseErrorListener();
        parser.addErrorListener(myParseErrorListener);
        // 最终调用语法分析器的规则maillist（这个是我们在Maillist.g4里面定义的那个规则），完成对邮箱地址列表的验证
        ParseTree parserTree = parser.maillist();


        ParseTreeWalker walker = new ParseTreeWalker();
        MaillistBaseListener maillistBaseListener = new MaillistBaseListener();
        walker.walk(maillistBaseListener, parserTree);

        //构造json数据
        Maillist maillist = new Maillist();

        maillist.mailBoxes = maillistBaseListener.mailBoxes;
        maillist.errMsg = new ArrayList<String>();
        maillist.errMsg.addAll(myLexErrorListener.errorList);
        maillist.errMsg.addAll(myParseErrorListener.errorList);
        maillist.finalList = maillistBaseListener.finalMailList;
        maillist.hasError = false;
        if (maillistBaseListener.isError.contains(true)){
            maillist.hasError = true;
        }

        //验证邮箱地址的有效性
        OkHttpClient okHttpClient = new OkHttpClient();

        for (MailBox mailBox:
             maillist.mailBoxes) {
            mailBox.isValid = false;
            //如果邮箱地址合法则判断有效性
            if(!mailBox.isError){
                /**
                Request request = new Request.Builder().url("https://app.verify-email.org/api/v1/myxNPqXvf8on2yhoNStg6ca3MBjJN8hfQ7JPhReUrMEmDAZuwE/verify/" + mailBox.mailAddress).build();
                try (Response response = okHttpClient.newCall(request).execute()) {
                    okhttp3.ResponseBody body = (okhttp3.ResponseBody) response.body();
                    if (response.isSuccessful()) {
                        VerifyRes verifyRes = JSON.parseObject(body.string(), VerifyRes.class);
                        if(verifyRes.getStatus() == 1){
                            mailBox.isValid = true;
                        }
                    }
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
                 **/
                try {
                    EmailVerfication emailVerfication = new EmailVerfication();
                    mailBox.isValid = emailVerfication.verifyEmail(mailBox.mailAddress);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }

        return maillist;
    }
}
