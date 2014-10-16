/*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*;	//importa todas las clases de Java 
public class Ejemplo2 {		//Clase principal del programa
    public static void main(String[] args){	//Arranque del programa
        Scanner sc = new Scanner(System.in);	//Clase Scanner recojera lo que se introduzca por el teclado
        double numero1, numero2;		//Se declara las variables con atributo decimales
        System.out.println("Introduce el primer número:");	//Muestra por pantalla la siguiente frase
        numero1 = sc.nextDouble();
        System.out.println("Introduce el segundo número:");	//Muestra por pantalla la siguiente frase
        numero2 = sc.nextDouble();
        System.out.println("Números introducido: " + numero1 + "  " + numero2);	//Muestra por pantalla la siguiente frase con el valor recogido de las variables
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));	//Muestra por pantalla el calculo  sumar entre las dos variables
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));	//Muestra por pantalla el calculo restar entre las dos variables
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);	//Muestra por pantalla el calculo  multiplicar entre las dos variables
    }	
}
