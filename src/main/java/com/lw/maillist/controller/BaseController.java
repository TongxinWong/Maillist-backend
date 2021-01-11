package com.lw.maillist.controller;



import com.lw.maillist.grammar.*;
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

    @GetMapping("/test/{listStr}")
    public Maillist Parse(@PathVariable String listStr){
        System.out.println("输入的字符串" + listStr);
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
        for (String s: myParseErrorListener.errorList) {
            System.out.println("sdfd"+s);
        }

        //构造json数据
        Maillist maillist = new Maillist();

        maillist.mailBoxes = maillistBaseListener.mailBoxes;
        maillist.errMsg = myParseErrorListener.errorList;
        maillist.hasError = false;
        if (maillistBaseListener.isError.contains("true")){
            maillist.hasError = true;
        }

        return maillist;
    }

    @PostMapping("/test1")
    public Maillist Parse2(@RequestBody OriginMaillist originMaillist){
        String listStr = originMaillist.getOriginMaillist();
        System.out.println("输入的字符串" + listStr);
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
        for (String s: myParseErrorListener.errorList) {
            System.out.println("sdfd"+s);
        }

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

        return maillist;
    }
}
