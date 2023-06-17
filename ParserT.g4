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
imprimir: OUTPUT (VARNAME | CHAR | INT | FLOAT | operacion)+;
leer: INPUT declarar;

//Operaciones matemáticas
operacion: (suma | multiplicacion | resta | pow | cos | sin)+;
operable: (VARNAME | ctes | INT | FLOAT);

suma: operable (SUMAR operable)+;
multiplicacion: operable (MULT operable)+;
resta: operable (RESTAR operable)+;
division: operable (DIV operable)+;


pow: VARNAME POW (INT | operacion | VARNAME);
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
mayor: operable MAYOR operable;
menor: operable MENOR operable;
igual: operable IGUAL operable;
distinto: operable DISTINTO operable;