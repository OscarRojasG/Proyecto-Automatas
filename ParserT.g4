grammar ParserT;
import LexerT;

program : cons BEGIN statement* END;
          
statement : operacion | ciclo | si | leer | imprimir| declarar;

// Constantes
cons: declarar*;

// Tipos de variables
declarar: cadena | entero | flotante;
cadena: VARNAME 'dice' CHAR;
entero: VARNAME 'es nivel' INT;
flotante:VARNAME 'es nivel' FLOAT;

// Entrada / Salida
imprimir: OUTPUT (VARNAME | CHAR)+;
leer: INPUT declarar;

//Operaciones matemáticas
operacion: suma | multiplicacion | resta | pow | cos | sin;
suma: VARNAME SUMAR VARNAME;
multiplicacion: VARNAME MULT VARNAME;
resta: VARNAME RESTAR VARNAME;
division: VARNAME DIV VARNAME;

pow: VARNAME POW INT;
cos: COSENO VARNAME;
sin: SENO VARNAME;

// Ciclos
ciclo: mientras | mientrasque;
mientras: WHILE condicional '{' statement+ '}';
mientrasque: DO '{' statement+ '}' WHILE condicional;

// Condicionales
si: IF condicional '{' statement+ '}';

// Operadores lógicos
condicional: comparacion ((OR | AND) comparacion)*;

comparacion: mayor | menor | igual | distinto;
mayor: VARNAME MAYOR VARNAME;
menor: VARNAME MENOR VARNAME;
igual: VARNAME IGUAL VARNAME;
distinto: VARNAME DISTINTO VARNAME;