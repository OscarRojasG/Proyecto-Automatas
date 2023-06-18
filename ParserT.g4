grammar ParserT;
import LexerT;

program : constante* BEGIN statement* END;
          
statement : (operacion | ciclo | si | leer | imprimir | declarar);

// Constantes
constante: declarar;
valor_constante: pi;
pi: PICHU;

// Tipos de variables
declarar: cadena | entero | flotante | declarar_operacion;
cadena: VARNAME 'dice' CHAR;
entero: VARNAME 'es nivel' INT;
flotante: VARNAME 'es nivel' (FLOAT | valor_constante);
declarar_operacion: VARNAME 'es igual a' operacion;

// Entrada / Salida
imprimir: OUTPUT (VARNAME | CHAR | expresion)+;
leer: INPUT declarar;

//Operaciones matemáticas
expresion: termino (operacion termino)*;
operacion: suma | resta | multiplicacion | division;
termino: funcion | VARNAME | INT | FLOAT | valor_constante;
funcion: pow | cos | sin;

suma: SUMAR;
multiplicacion: MULT;
resta: RESTAR;
division: DIV;

pow: (INT | FLOAT | VARNAME | valor_constante) POW (INT | FLOAT | VARNAME | valor_constante);
cos: COSENO (INT | FLOAT | VARNAME | valor_constante);
sin: SENO (INT | FLOAT | VARNAME | valor_constante);

// Ciclos
ciclo: mientras | mientrasque;
mientras: WHILE condicional '{' statement+ '}';
mientrasque: DO '{' statement+ '}' WHILE condicional;

// Condicionales
si: IF condicional '{' statement+ '}';

// Operadores lógicos
condicional: comparacion ((OR | AND) comparacion)*;

comparacion: mayor | menor | igual | distinto;
mayor: expresion MAYOR expresion;
menor: expresion MENOR expresion;
igual: expresion IGUAL expresion;
distinto: expresion DISTINTO expresion;