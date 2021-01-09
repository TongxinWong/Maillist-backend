package com.lw.maillist.grammar;

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class MyLexErrorListener extends BaseErrorListener {
    public List<String> errorList = new ArrayList<>();
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        errorList.add("line " + line + ":" + charPositionInLine + " " + msg);
        System.out.println("line " + line + ":" + charPositionInLine + " " + msg);
    }
}
