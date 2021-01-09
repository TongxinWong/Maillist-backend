package com.lw.maillist.grammar;

import org.antlr.v4.runtime.*;

public class MyLexErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        System.out.println("line " + line + ":" + charPositionInLine + " " + msg);
    }
}
