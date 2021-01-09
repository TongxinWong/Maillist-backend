package com.lw.maillist.controller;

import com.lw.maillist.grammar.MyLexErrorListener;
import com.lw.maillist.grammar.MyParseErrorListener;
import com.lw.maillist.grammar.MaillistLexer;
import com.lw.maillist.grammar.MaillistParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BaseController {

    @GetMapping("/test")
    public String Test(){
        String expr = "wangtx@whu.edu.cn;jue0325@gmail.com;";
        // 对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream input = new ANTLRInputStream(expr);
        // 用 in 构造词法分析器 lexer，词法分析的作用是将字符聚集成单词或者符号
        MaillistLexer lexer = new MaillistLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MyLexErrorListener());
        // 用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        MaillistParser parser = new MaillistParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new MyParseErrorListener());
        // 最终调用语法分析器的规则 r（这个是我们在Hello.g4里面定义的那个规则），完成对表达式的验证
        parser.maillist();
        return "hhh";

//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new MaillistBaseListener(), parserTree);
//        return parserTree.toStringTree(parser);
    }
}
