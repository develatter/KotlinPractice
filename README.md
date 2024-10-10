# KotlinPractice
Ejercicios básicos de programación resueltos en Kotlin

## Relación de Ejercicios

### 1. Positivo y negativo
Leer un número por teclado mediante un método, y decir si es positivo o negativo con otro método. La salida por consola puede ser algo así como: "el número X es positivo"
### 2. Raíz cuadrada
Calcular la raíz cuadrada de un número introducido por teclado. Hay que tener la precaución de comprobar que el número sea positivo.
### 3. Restar
Leídos dos números por teclado, llamémosles A y B, calcular y mostrar la resta del mayor menos el menor. Por ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el resultado debe ser B – A, es decir, 3.
### 4. Año bisiesto
Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de 4; utilícese el operador módulo. ¡Pero hay más excepciones! Los múltiplos de 100 no son bisiestos, aunque sean múltiplos de 4. Pero los múltiplos de 400 sí, aunque sean múltiplos de 100. Qué follón. La Tierra es muy maleducada al no ajustarse a los patrones de tiempo humanos.
Resumiendo: un año es bisiesto si es divisible entre 4, a menos que sea divisible entre 100. Sin embargo, si un año es divisible entre 100 y además es divisible entre 400, también resulta bisiesto.
Ahora, prográmalo, a ver qué sale.
### 5. Parte decimal
Averiguar si un número real introducido por teclado tiene o no parte fraccionaria (utilícese el método Math.round() que aparece descrito en el tema 1, o si no, búscalo en Internet)
### 6. Numeros ordenados
Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor. Complétalo con otro método que nos diga si los números, además de estar ordenados, son consecutivos.
### 7. Contar cifras
Determinar el número de cifras de un número entero. El algoritmo debe funcionar para números de hasta 5 cifras, considerando los negativos. Por ejemplo, si se introduce el número 5342, la respuesta del programa debe ser 4. Si se introduce –250, la respuesta debe ser 3.
Para los quisquillosos: no, el 0 a la izquierda no cuenta.
### 8. Mayor, menor, mediano
Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el menor y cuál el mediano. Y da gracias a que no lo hemos hecho con 4 variables. Prohibido usar arrays, suponiendo que sepas lo que son. Es un ejercicio de lógica, no de bucles.
### 9. Pares
Ahora sí empiezan los bucles. Escribe un programa que muestre todos los números pares entre A y B, siendo estos dos valores dos números introducidos por teclado. A debe ser menor que B, claro. En caso contrario, el programa debe avisarnos, pero con cariño.
### 10. Impares
Escribir todos los números impares entre dos números A y B introducidos por teclado. En esta ocasión, cualquier de ellos puede ser el mayor. Habrá que comprobar, entonces, cuál de los dos números, A o B es mayor, para empezar a escribir los impares desde uno o desde otro.
### 11. Pares o nones
Escribe un programa que pregunte al usuario si desea ver los números pares o impares y que, dependiendo de la respuesta, muestre en la pantalla los números pares o impares entre A y B. Cualquiera de ellos puede ser el mayor. Y sí, es un batiburrillo de los dos anteriores, así que intenta reutilizar todo el código que puedas. En programación eso no se considera plagio, salvo que te pillen.
### 12. Dibujando con asteriscos
Escribe una clase capaz de generar en la pantalla, mediante bucles, algunos diseños con asteriscos.
### 13. Tabla de multiplicar
Vamos con un clásico de los cursos de introducción a la programación. El usuario teclea un número y el programa muestra la tabla de multiplicar de ese número. Pero que quede bonito, por favor, algo así como:
### 14. Acumulador simple
Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998 + 1000. No preguntes en los foros de programación, seguro que puedes hacerlo por ti mismo.
### 15. Acumulador interactivo
Calcular el valor medio de una serie de valores enteros positivos introducidos por teclado. Para terminar de introducir valores, el usuario debe teclear un número negativo.
### 16. Estadística básica
Calcular el valor máximo de una serie de 10 números introducidos por teclado. Completa luego la clase para que también averigüe el valor mínimo, el medio, la desviación típica y la mediana. Si no sabes lo que es alguna de estas cosas, háztelo mirar. También puedes probar en internet. O incluso preguntando a tus profesores por si les suena el asunto.
### 17. Notas de clase
El usuario de este programa será un profesor, que introducirá las notas de sus 30 alumnos de una en una. El algoritmo debe decirle cuántos suspensos y cuántos aprobados hay. Las notas pueden valer entre 1 y 10, y el programa no debe aceptar valores fuera de ese rango.
### 18. Factorial
Calcular el factorial de un número entero N. Recuerda que el factorial de un número es el producto de ese número por todos los enteros menores que él. Por ejemplo, el factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.
Cuando funcione, prueba a calcular el factorial de un número muy grande, como 288399849! o algo parecido, y verás qué risa.
### 19. Sucesión de Fibonacci
La famosa sucesión de Fibonacci es una sucesión no convergente de números enteros que comienza así:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Cada número de la sucesión se calcula sumando los dos números anteriores (excepto los dos primeros, que son, por definición, 0 y 1).
Se da la curiosa circunstancia de que los números de la sucesión de Fibonacci aparecen con sorprendente precisión en muchas estructuras naturales, como los ángulos de crecimiento de las ramas de árboles cuando son iluminados verticalmente, la disposición de los pétalos de los girasoles o de las piñas en los pinos, la forma de las cochas de los caracoles, y cosas así. Si lo piensas, es un poco inquietante que un producto de la imaginación humana como son las matemáticas tenga una relación tan estrecha con la naturaleza. ¿O era al revés? Bueno, al diablo.
A lo que íbamos: escribe un programa que muestre en la pantalla los N primeros términos de la sucesión de Fibonacci, siendo N un número entero introducido por el usuario.
### 20. Número de la suerte
El número de la suerte o lucky number, por si hay alguien de Cuenca, es una tontuna de los numerólogos y otros charlatanes que se obtiene sumando todas las cifras de la fecha de nacimiento de un modo azaroso. Por ejemplo, como yo nací el 15 de octubre de 1974 (15-10-1974), se supone que mi número de la suerte es 15+10+1974 = 1999. Ahora sumo todas las cifras de 1999 así: 1+9+9+9 = 28. Como aún tengo dos dígitos, vuelvo a sumarlos. 2 + 8 = 10 => 1 + 0 = 1.
Por lo tanto, 1 es mi número de la suerte. Si alguna vez me toca la lotería y llevo un número acabado en 1, os aviso.
Escribe un programa que, dada una fecha de nacimiento, calcule el número de la suerte de esa persona.
