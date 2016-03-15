package com.helix;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.helix.psi.HelenTypes;
import com.intellij.psi.TokenType;
%%
%class HelenLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%state INCLUDE
%eof{  return;
%eof}
%%
if                       { return HelenTypes.IF; }
else                     { return HelenTypes.ELSE; }
endif                    { return HelenTypes.ENDIF; }
fun                      { return HelenTypes.FUN; }
endfun                   { return HelenTypes.ENDFUN; }
operator                 { return HelenTypes.OPERATORKW; }
declare                  { return HelenTypes.DECLARE; }
loop                     { return HelenTypes.LOOP; }
endloop                  { return HelenTypes.ENDLOOP; }
return                   { return HelenTypes.RETURN; }
use                      { return HelenTypes.USE; }
resize                   { return HelenTypes.RESIZE; }
size                     { return HelenTypes.SIZE; }
type                     { return HelenTypes.TYPEKW; }
endtype                  { return HelenTypes.ENDTYPE; }
int                      { return HelenTypes.INT; }
real                     { return HelenTypes.REAL; }
logical                  { return HelenTypes.LOGICAL; }
char                     { return HelenTypes.CHAR; }
array                    { return HelenTypes.ARRAY; }
interface                { return HelenTypes.INTERFACE; }
alias                    { return HelenTypes.ALIAS; }
in                       { return HelenTypes.IN; }
out                      { return HelenTypes.OUT; }
method                   { return HelenTypes.METHOD; }
constructor              { return HelenTypes.CONSTRUCTOR; }
destructor               { return HelenTypes.DESTRUCTOR; }
style                    { return HelenTypes.STYLE; }
new                      { return HelenTypes.NEW; }
delete                   { return HelenTypes.DELETE; }
ptr                      { return HelenTypes.PTR; }
cast                     { return HelenTypes.CAST; }
to                       { return HelenTypes.TO; }
mainmodule               { return HelenTypes.MAINMODULE; }
shiftby                  { return HelenTypes.SHIFTBY; }
include                  { yybegin(INCLUDE); return HelenTypes.INCLUDE; }
\n                       { return HelenTypes.NEWLINE; }
[ \t]                    { return TokenType.WHITE_SPACE; }
[a-zA-Z][a-zA-Z0-9]*     { return HelenTypes.ID; }
"<-"                     { /*return HelenTypes.LARROW;*/ return TokenType.BAD_CHARACTER; /* temp */ }
"->"                     { return HelenTypes.RARROW; }
\(                       { return HelenTypes.LPAREN; }
\)                       { return HelenTypes.RPAREN; }
\;                       { /*return HelenTypes.SEMI;*/ return TokenType.BAD_CHARACTER; /* temp */ }
\:                       { return HelenTypes.COLON; }
\,                       { return HelenTypes.COMMA; }
\.                       { return HelenTypes.POINT; }
"#"[^\n]*                { return HelenTypes.COMMENT; }
<INCLUDE>[ \t]*          { return TokenType.WHITE_SPACE; /* temp */ }
<INCLUDE>[^ \t\n]+       { yybegin(YYINITIAL); return HelenTypes.STRLIT; /* temp */ }
[\+\-\*\/\<\>\=@\&\|\~\!]+      { return HelenTypes.OPERATOR; }
[\+\-]?[0-9]+[\.\,][0-9]+       { return HelenTypes.REALLIT; }
[\+\-]?[0-9]+                   { return HelenTypes.INTLIT; }
'[^(')]'                 { return HelenTypes.CHARLIT; }
\"[^(\")]*\"             { return HelenTypes.STRLIT; }