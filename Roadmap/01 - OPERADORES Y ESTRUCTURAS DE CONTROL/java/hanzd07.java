/* EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */
// Operadores Aritméticos
int suma = (5 + 5);
int resta = (5 - 3);
int multiplicacion = (5 * 7);
int division = (10 / 3);
int modulo = (4 % 3);
//Operadores de comparación
boolean igualdad = (5 == 5);
boolean noEsIgual = (3 != 4);
boolean mayorQue = (3 > 1);
boolean mmenorQue = (7 < 8);
boolean mayorOIgual = (3 >= 1);
boolean mmenorOIgual = (7 <= 8);
//Operadores Lógicos
boolean andLogico = (4 > 3 && 2 > 1); //ambas condiciones son true
boolean orLogico = (4 > 3 || 2 < 1); //una condicion es true 
boolean notLogico = !(5 > 3); //invierte el resultado
//Operadores de asignación
int miNumero = 7;//asignacion simple
miNumero += 3; // equivalente a miNumero = miNumero +3, suma y asiginación
miNumero -= 3; // equivalente a miNumero = miNumero -3, resta y asiginación
miNumero *= 3; // equivalente a miNumero = miNumero *3, multiplicación y asiginación
miNumero /= 3; // equivalente a miNumero = miNumero /3, división y asiginación
miNumero %= 3; // equivalente a miNumero = miNumero %3, módulo y asginación
miNumero **= 3; // equivalente a miNumero = miNumero **3, exponente y asginación
//Operadores de identidad
integer a = new integer(1);
integer b = new integer(1);
integer c = a;
boolean resultado1 = (a == b);  // false, porque a y b son referencias a diferentes objetos
boolean resultado2 = (a == c);  // true, porque a y c son referencias al mismo objeto
//Operadores de bit
//AND
int a = 5; // 0101 en binario
int b = 3; // 0011 en binario
int resultado = a & b; // 0001 en binario, 1 en decimal
//OR
int a = 5; // 0101 en binario
int b = 3; // 0011 en binario
int resultado = a | b; // 0111 en binario, 7 en decimal
//XOR
int a = 5; // 0101 en binario
int b = 3; // 0011 en binario
int resultado = a & b; // 0110 en binario, 6 en decimal
//~
int a = 5; // 0101 en binario
int resultado = ~a; // 1010 en binario, -6 en decimal
//<<
int a = 5;  // 0101 en binario
int resultado = a << 1;  // 1010 en binario, que es 10 en decimal
//>>
int a = 5;  // 0101 en binario
int resultado = a >> 1;  // 0010 en binario, que es 2 en decimal
//Estructuras de Control
