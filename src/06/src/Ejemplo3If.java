/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;		//importa todas las clases del paquete java.util
public class Ejemplo3If {		//Clase principal del programa
    public static void main(String[] args) {		//Arranque del programa
      Scanner sc = new Scanner(System.in);		//Clase Scanner recogera lo que se introduzca por el teclado	
      double nota;					//se define la variable
      System.out.println("Introduzca una nota entre 0 y 10: ");		//Muestra por pantalla la siguiente frase		
      nota = sc.nextDouble();				//Se recoge el valor en tipo decimal y lo guarda en la variable
      System.out.println("La calificación del alumno es ");	//Muestra por pantalla la siguiente frase
      if(nota < 0 || nota > 10)			//Si el valor de la variables es menor que 0 o mayor que 10 muestra que la nota no es valida
         System.out.println("Nota no válida");
      else if(nota==10)				//sino cumple la condicion anterior, y si el valor es igual a 10, muestra la siguiente frase por pantalla
           System.out.println("Matrícula de Honor");
      else if (nota >= 9)			//Si el valor es igual o mayor 	que 9 muestra la siguiente frase por pantalla
           System.out.println("Sobresaliente");
      else if (nota >= 7)			//Si el valor es igual o mayor 	que 7 muestra la siguiente frase por pantalla
           System.out.println("Notable");
      else if (nota >= 6)			//Si el valor es igual o mayor 	que 6 muestra la siguiente frase por pantalla
           System.out.println("Bien");
      else if (nota >= 5)			//Si el valor es igual o mayor 	que 5 muestra la siguiente frase por pantalla
           System.out.println("Suficiente");
      else
           System.out.println("Suspenso");	//Si el valor no cumple las condiciones expuestas por las anteriores, mostrara el siguiente mensaje por pantalla
    }
}

