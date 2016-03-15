package com.helix;

/**
 * Created by main on 15.03.2016.
 */

import com.helix.psi.HelenType;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.helix.psi.HelenTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class HelenSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("HELEN_KW", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("HELEN_NUM", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("HELEN_OP", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey ID = createTextAttributesKey("HELEN_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("HELEN_COMM", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey DOT = createTextAttributesKey("HELEN_COMM", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey COMMA = createTextAttributesKey("HELEN_COMM", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey PARENS = createTextAttributesKey("HELEN_COMM", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey STRING = createTextAttributesKey("HELEN_COMM", DefaultLanguageHighlighterColors.STRING);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new HelenLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        Object tt = tokenType; // the brevity is a sister of the talent
        if (tt.equals(HelenTypes.ALIAS) || tt.equals(HelenTypes.ARRAY) || tt.equals(HelenTypes.CAST)
                || tt.equals(HelenTypes.CAST) || tt.equals(HelenTypes.CONSTRUCTOR) || tt.equals(HelenTypes.DECLARE)
                || tt.equals(HelenTypes.DELETE) || tt.equals(HelenTypes.DESTRUCTOR) || tt.equals(HelenTypes.ELSE)
                || tt.equals(HelenTypes.ENDFUN) || tt.equals(HelenTypes.ENDIF) || tt.equals(HelenTypes.ENDLOOP)
                || tt.equals(HelenTypes.ENDTYPE) || tt.equals(HelenTypes.FUN) || tt.equals(HelenTypes.IF)
                || tt.equals(HelenTypes.IN) || tt.equals(HelenTypes.INT) || tt.equals(HelenTypes.INTERFACE)
                || tt.equals(HelenTypes.LOGICAL) || tt.equals(HelenTypes.LOOP) || tt.equals(HelenTypes.MAINMODULE)
                || tt.equals(HelenTypes.METHOD) || tt.equals(HelenTypes.NEW) || tt.equals(HelenTypes.OPERATORKW)
                || tt.equals(HelenTypes.OUT) || tt.equals(HelenTypes.PTR) || tt.equals(HelenTypes.REAL)
                || tt.equals(HelenTypes.RESIZE) || tt.equals(HelenTypes.RETURN) || tt.equals(HelenTypes.SHIFTBY)
                || tt.equals(HelenTypes.SIZE) || tt.equals(HelenTypes.STYLE) || tt.equals(HelenTypes.TO)
                || tt.equals(HelenTypes.TYPEKW) || tt.equals(HelenTypes.USE) || tt.equals(HelenTypes.INCLUDE)
                ) {
            return new TextAttributesKey[]{KEYWORD};
        } else if (tt.equals(HelenTypes.INTLIT) || tt.equals(HelenTypes.REALLIT)) {
            return new TextAttributesKey[]{NUMBER};
        } else if (tt.equals(HelenTypes.OPERATOR) || tt.equals(HelenTypes.RARROW)) {
            return new TextAttributesKey[]{OPERATOR};
        } else if (tt.equals(HelenTypes.ID)) {
            return new TextAttributesKey[]{ID};
        } else if (tt.equals(HelenTypes.COMMENT)) {
            return new TextAttributesKey[]{COMMENT};
        } else if (tt.equals(HelenTypes.POINT)) {
            return new TextAttributesKey[]{DOT};
        } else if (tt.equals(HelenTypes.COMMA)) {
            return new TextAttributesKey[]{COMMA};
        } else if (tt.equals(HelenTypes.LPAREN) || tt.equals(HelenTypes.RPAREN)) {
            return new TextAttributesKey[]{PARENS};
        } else if (tt.equals(HelenTypes.STRLIT)) {
            return new TextAttributesKey[]{STRING};
        } else {
            return new TextAttributesKey[0];
        }
    }
}
