package analisador;
import static analisador.Token.*;

%%

%class Lexer
%type Token
D = [0-9]
L = [a-zA-Z_]
WHITE = [ \t\n\r]
%{
public String lexeme;
%}

%%

{WHITE} {/*Ignore*/}
("//".*) {lexeme = yytext(); return comentario;}


(",") {lexeme = yytext(); return virgula;}
("'") {lexeme = yytext(); return aspas;}
("(") {lexeme = yytext(); return AbParentese;}
(")") {lexeme = yytext(); return FchParentese;}
("{") {lexeme = yytext(); return AbChave;}
("}") {lexeme = yytext(); return FchChave;}
(";") {lexeme = yytext(); return FinalLinha;}
("[") {lexeme = yytext(); return AbColchete;}
("]") {lexeme = yytext(); return FchColchete;}
(":") {lexeme = yytext(); return DoisPontos;}

("([a-zA-Z]\.[\w*])") {lexeme = yytext(); return Variavel;}
("=") {lexeme = yytext(); return atribuicao;}
("==") {lexeme = yytext(); return OpRelacional;}
("<") {lexeme = yytext(); return OpRelacional;}
("<=") {lexeme = yytext(); return OpRelacional;}
(">") {lexeme = yytext(); return OpRelacional;}
(">=") {lexeme = yytext(); return OpRelacional;}

("subtracao") {lexeme = yytext(); return OpMatematica;}
("divisao") {lexeme = yytext(); return OpMatematica;}
("multiplicacao") {lexeme = yytext(); return OpMatematica;}
("soma") {lexeme = yytext(); return OpMatematica;}
("raizquadrada") {lexeme = yytext(); return OpMatematica;}
("potencia") {lexeme = yytext(); return OpMatematica;}
("porcentagem") {lexeme = yytext(); return OpMatematica;}
("fatorial") {lexeme = yytext(); return OpMatematica;}
("logaritmo") {lexeme = yytext(); return OpMatematica;}

("cosseno") {lexeme = yytext(); return trigonometria;}
("seno") {lexeme = yytext(); return trigonometria;}
("tangente") {lexeme = yytext(); return trigonometria;}

("int") {lexeme = yytext(); return tipo;}
("double") {lexeme = yytext(); return tipo;}
("string") {lexeme = yytext(); return tipo;}
("float") {lexeme = yytext(); return tipo;}
("bool") {lexeme = yytext(); return tipo;}

(se) {lexeme = yytext(); return se;}
(senao) {lexeme = yytext(); return senao;}
(enquanto) {lexeme = yytext(); return enquanto;}
(para) {lexeme = yytext(); return para;}
(caso) {lexeme = yytext(); return caso;}
(escreva) {lexeme = yytext(); return escreva;}
(leia) {lexeme = yytext(); return leia;}
(retorna) {lexeme = yytext(); return retorna;}
(break) {lexeme = yytext(); return break1;}
(switch) {lexeme = yytext(); return switch1;}

[-+]?{D}*[.]{D}+ {lexeme = yytext(); return num;}
[-+]?{D}+ {lexeme = yytext(); return num;}
{L}* {lexeme = yytext(); return literal;}

. {return erro;}