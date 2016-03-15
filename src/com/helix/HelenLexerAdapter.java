package com.helix;

/**
 * Created by main on 14.03.2016.
 */


import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class HelenLexerAdapter extends FlexAdapter {
    public HelenLexerAdapter() {
        super(new HelenLexer((Reader) null));
    }
}
