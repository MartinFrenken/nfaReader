
grammar MyGrammar;

// rules
myStart: line* EOF;
//Expressions
line    : sat |UNSAT;
sat     : SAT LEFTBRACKET modelDeclaration  functionDefine* RIGHTBRACKET;

modelDeclaration   : MODEL;

functionDefine:LEFTBRACKET DEFINEFUN name? coordinate? functionParameter numberDeclaration RIGHTBRACKET ;

functionParameterName : VARIABLE;
functionInput         : EQUALS VARIABLE SINGLENUMBER RIGHTBRACKET;
functionParameter:LEFTBRACKET parameterDefine* RIGHTBRACKET;
parameterDefine:  LEFTBRACKET functionParameterName  INTEGER? RIGHTBRACKET;
coordinate: COORDINATE;
numberDeclaration: (INTEGER (SINGLENUMBER|inputSpecification))|(NUMBER RIGHTBRACKET);
stringDeclaration: STRING;
inputSpecification: LEFTBRACKET ITE and inputSpecification? SINGLENUMBER? RIGHTBRACKET ;
name: VARIABLE;
and: LEFTBRACKET AND functionInput* RIGHTBRACKET SINGLENUMBER;
// tokens
EQUALS     :'(=';
COMMA      : ',';
INTEGER     : 'Int';
DEFINEFUN   :'define-fun';
LEFTBRACKET :'(';
STRING      :'String';
RIGHTBRACKET:')';
AND         : 'and';
MODEL       :'model';
SAT         : 'sat';
UNSAT       : 'unsat';
EXCLAMATIONMARK: '!';
SINGLENUMBER:[0-9];
ITE         : 'ite';
COORDINATEINIT:'a';
COORDINATE   :'a'[0-9][0-9];
VARIABLE:[a-zA-Z]+'!'?[0-9]?;
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ;
WS 			: [ \n\t\r]+ -> skip ;

