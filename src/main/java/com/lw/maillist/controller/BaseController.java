package com.lw.maillist.controller;



import com.lw.maillist.grammar.*;
import com.alibaba.fastjson.JSON;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BaseController {

    @GetMapping("/test")
    public String Test(){
        String expr = "wangtx@wh_u.edu.cn;jue$$$0325@gmail.com;";
        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream input = new ANTLRInputStream(expr);
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
        // 最终调用语法分析器的规则 r（这个是我们在Hello.g4里面定义的那个规则），完成对表达式的验证
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

        //生成json数据
        String json =JSON.toJSONString(maillist);
        System.out.println(json);


        return parserTree.toStringTree(parser);


        //System.out.println("test");
        //return "hhh";
    }
}
