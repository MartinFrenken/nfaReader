
grammar MyGrammar;

// rules
myStart: line* EOF;
//Expressions
line    : sat |UNSAT;
sat     : SAT LEFTBRACKET modelDeclaration  functionDefine* RIGHTBRACKET;

modelDeclaration   : MODEL;

functionDefine:LEFTBRACKET DEFINEFUN (name?|coordinate?) functionParameter typeDeclaration ifThenElse? RIGHTBRACKET ;
typeDeclaration:numberDeclaration|stringDeclaration|booleanDeclaration;
functionParameterName : VARIABLE;
equalsExpression         : EQUALS VARIABLE (NUMBER|string) RIGHTBRACKET;
functionParameter:LEFTBRACKET parameterDefine* RIGHTBRACKET;
parameterDefine:  LEFTBRACKET functionParameterName  (INTEGER?|STRINGTOKEN?) RIGHTBRACKET;
numberDeclaration: (INTEGER NUMBER|NUMBER RIGHTBRACKET);
stringDeclaration: STRINGTOKEN QUOTE name QUOTE;
booleanDeclaration:BOOLEANTOKEN;
ifThenElse: LEFTBRACKET ITE and ifThenElse?  boolean? RIGHTBRACKET ;
string : QUOTE name QUOTE;
name: STRING;
coordinate: COORDINATE;
and: LEFTBRACKET AND equalsExpression* RIGHTBRACKET (NUMBER|boolean);
boolean:TRUE|FALSE;
// tokens
EQUALS     :'(=';
COMMA      : ',';
INTEGER     : 'Int';
DEFINEFUN   :'define-fun';
LEFTBRACKET :'(';
STRINGTOKEN      :'String';
BOOLEANTOKEN:'Bool';
RIGHTBRACKET:')';
AND         : 'and';
MODEL       :'model';
SAT         : 'sat';
UNSAT       : 'unsat';
EXCLAMATIONMARK: '!';
NUMBER:[0-9]+;
QUOTE       :'"';
ITE         : 'ite';
TRUE        :'true';
FALSE       :'false';
COORDINATE   :'a'[0-9][0-9];
STRING       :([a-zA-Z]|[0-9]|(':'))+;
VARIABLE:[a-zA-Z]+'!'?[0-9]?;
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
WS 			: [ \n\t\r]+ -> skip ;
COORDINATEINIT:'a';
