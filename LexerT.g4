lexer grammar LexerT;

BEGIN: 'empezar combate';
END: 'combate finalizado';
OUTPUT: 'yo te elijo';
INPUT: 'mote';

IF: 'si';
ELSE: 'sino';
DO: 'hacer';
WHILE: 'mientras';
FOR: 'para';

VARNAME: [a-z]+;
CHAR:  '"' (.)*? '"' ; 
INT: '-'? [0-9]+;
FLOAT: [0-9]+ ',' [0-9]+;

COSENO: 'cosmog';
SENO: 'sentret';


SUMAR: 'es curado por';
RESTAR: 'es atacado por';
MULT: 'junto con';
DIV: 'debilita';
POW: 'potencia';

MAYOR: ('es de' | 'tenga') 'mayor nivel que';
MENOR: ('es de' | 'tenga') 'menor nivel que';
IGUAL: ('es del' | 'tenga el') 'mismo nivel que';
DISTINTO: ('es de' | 'tenga') 'distinto nivel que';
OR: 'o';
AND: 'y';

//Constante
PICHU: 'PICHU';
MEW: 'inf';
MEWTWO: '-inf';

NUMBER : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;