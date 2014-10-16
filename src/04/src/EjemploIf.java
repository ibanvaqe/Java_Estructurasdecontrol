/*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;		//importa todas las clases de Java 
public class EjemploIf {	//Clase principal del programa
    public static void main(String[] args) {		//Arranque del programa
        Scanner sc = new Scanner(System.in);		//Clase Scanner recojera lo que se introduzca por el teclado
        int num;      					//Se define la variable con su atributo
        System.out.println("Introduzca numero: ");	//Muestra por pantalla la siguiente frase
        num = sc.nextInt();				//Recoge el valor en tipo Entero y lo guarda en la variable
        if ((num%2)==0)					//Si la variable cumple la condicion entra dentro
           System.out.println("PAR");			
        else						//Si no se cumple la condicion muestra este siguiente mensaje
            System.out.println("IMPAR");
    }
}
