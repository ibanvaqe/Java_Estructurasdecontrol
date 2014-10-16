/*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;			//importa todas las clases del paquete java.util
public class Ejemplo2If {		//Clase principal del programa
    public static void main(String[] args) {		//Arranque del programa
      Scanner sc = new Scanner(System.in);		//Clase Scanner recogera lo que se introduzca por el teclado
      int hora;						//se define la variable
      System.out.println("Introduzca una hora (un valor entero): ");	//Muestra por pantalla la siguiente frase
      hora = sc.nextInt();			//Se recoge el valor en tipo Entero y lo guarda en la variable
      if (hora >= 0 && hora < 12)		//Si la variable es igual o mayor que 0 y menor que 12 entra dentro
          System.out.println("Buenos días");	
      else if (hora >= 12 && hora < 21)		//Sino es la condicion anterior y la variable es igual o mayor que 12 y menor 21, entra en la condicion
           System.out.println("Buenas tardes");
      else if (hora >= 21 && hora < 24)		//Sino no son las condiciones anteriores y la variables es igual o mayo que 21 y menor que 24 entra en la condicion
            System.out.println("Buenas noches");
      else					//Sino es ninguna condicion de las anteriores muestra por pantalla Hora no valida
            System.out.println("Hora no válida");
    }
}
