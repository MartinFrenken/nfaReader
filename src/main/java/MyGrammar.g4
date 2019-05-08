
grammar MyGrammar;

// rules
myStart: line* EOF;
//Expressions
line    : sat |UNSAT;
sat     : SAT LEFTBRACKET modelDeclaration  functionDefine* RIGHTBRACKET;

modelDeclaration   : MODEL;

functionDefine:LEFTBRACKET DEFINEFUN (name?|coordinate?) functionParameter typeDeclaration RIGHTBRACKET ;
typeDeclaration:numberDeclaration|stringDeclaration;
functionParameterName : VARIABLE;
functionInput         : EQUALS VARIABLE SINGLENUMBER RIGHTBRACKET;
functionParameter:LEFTBRACKET parameterDefine* RIGHTBRACKET;
parameterDefine:  LEFTBRACKET functionParameterName  (INTEGER?|STRINGTOKEN?) RIGHTBRACKET;
coordinate: COORDINATE;
numberDeclaration: (INTEGER (SINGLENUMBER|inputSpecification))|(NUMBER RIGHTBRACKET);
stringDeclaration: STRINGTOKEN QUOTE name QUOTE;
inputSpecification: LEFTBRACKET ITE and inputSpecification? SINGLENUMBER? RIGHTBRACKET ;
name: STRING;
and: LEFTBRACKET AND functionInput* RIGHTBRACKET SINGLENUMBER;
boolean:TRUE|FALSE;
// tokens
EQUALS     :'(=';
COMMA      : ',';
INTEGER     : 'Int';
DEFINEFUN   :'define-fun';
LEFTBRACKET :'(';
STRINGTOKEN      :'String';
RIGHTBRACKET:')';
AND         : 'and';
MODEL       :'model';
SAT         : 'sat';
UNSAT       : 'unsat';
EXCLAMATIONMARK: '!';
SINGLENUMBER:[0-9];
QUOTE       :'"';
ITE         : 'ite';
COORDINATEINIT:'a';
TRUE        :'true';
FALSE       :'false';
COORDINATE   :'a'[0-9][0-9];
STRING       :([a-zA-Z]|[0-9]|(':'))+;
VARIABLE:[a-zA-Z]+'!'?[0-9]?;
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
WS 			: [ \n\t\r]+ -> skip ;

