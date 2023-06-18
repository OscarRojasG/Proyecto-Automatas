grammar ParserT;
import LexerT;

program : cons BEGIN statement* END;
          
statement : (operacion | ciclo | si | leer | imprimir | declarar);

// Constantes
cons: declarar*;
ctes: PICHU;

// Tipos de variables
declarar: cadena | entero | flotante | declarar_operacion;
cadena: VARNAME 'dice' CHAR;
entero: VARNAME 'es nivel' INT;
flotante: VARNAME 'es nivel' (FLOAT | ctes);
declarar_operacion: VARNAME 'es igual a' operacion;
// Entrada / Salida
imprimir: OUTPUT (VARNAME | CHAR | INT | FLOAT | expresion)+;
leer: INPUT declarar;

//Operaciones matemáticas
expresion: termino (operacion termino)*;
operacion: suma | resta | multiplicacion | division;
termino: funcion | VARNAME | ctes | INT | FLOAT;
funcion: pow | cos | sin;

suma: SUMAR;
multiplicacion: MULT;
resta: RESTAR;
division: DIV;

pow: VARNAME POW (INT | FLOAT | VARNAME);
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
mayor: expresion MAYOR expresion;
menor: expresion MENOR expresion;
igual: expresion IGUAL expresion;
distinto: expresion DISTINTO expresion;