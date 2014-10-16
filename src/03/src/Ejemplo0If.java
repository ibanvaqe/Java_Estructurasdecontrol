/*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5 y muestra si se ha aprobado o no
 */
import java.util.*;	//importa todas las clases de Java 
public class Ejemplo0If {		//Clase principal del programa
    public static void main( String[] args ){	//Arranque del programa
        Scanner sc = new Scanner( System.in );	//Clase Scanner recojera lo que se introduzca por el teclado
        System.out.print("Nota: ");	//Muestra por pantalla la siguiente frase
        int nota = sc.nextInt();	//Recoge el valor en modo tipo Entero y se lo da a la variable de tipo Entero
        if (nota >= 5 ){		//Si la variable es igual o mayor que condicion entrara dentro de ella
            System.out.println("Enorabuena!!");		//Muestra por pantalla la siguiente frase con un salto de linea
            System.out.println("Has aprobado");		//Muestra por pantalla la siguiente frase con un salto de linea
        }
	 else
            System.out.println("Lo Siento, has suspendido");
    	
    }
}
