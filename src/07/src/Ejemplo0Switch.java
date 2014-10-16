/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;			//importa todas las clases del paquete java.util
public class Ejemplo0Switch {		//Clase principal del programa
    public static void main(String[] args) {		//Arranque del programa
        int mes;			//Se define la variable
        Scanner sc = new Scanner(System.in);		//Clase Scanner recogera lo que se introduzca por el teclado
        System.out.print("Introduzca un numero de mes: ");	//Muestra por pantalla la siguiente frase	
        mes = sc.nextInt();		//Se recoge el valor en tipo Entero y lo guarda en la variable
       //El switch es una instruccion en la que podremos evaluar muchas condiciones a la vez, en este caso, tenemos nuestro valor recogido en la variable y el switch compara ese valor con todas las condiciones que hay dentro de la instruccion. En este caso hacemos una comparacion con todos los meses del año. 	
	 switch (mes)		
        {
                case 1: System.out.println("ENERO"); // si el valor de la variable es 1 mostrara el siguiente mensaje
                           break;
                case 2: System.out.println("FEBRERO");	// si el valor de la variable es 2 mostrara el siguiente mensaje
                           break;
                case 3: System.out.println("MARZO");	// si el valor de la variable es 3 mostrara el siguiente mensaje
                           break;
                case 4: System.out.println("ABRIL");	// si el valor de la variable es 4 mostrara el siguiente mensaje
                           break;
                case 5: System.out.println("MAYO");	// si el valor de la variable es 5 mostrara el siguiente mensaje
                           break;
                case 6: System.out.println("JUNIO");	// si el valor de la variable es 6 mostrara el siguiente mensaje
                           break;
                case 7: System.out.println("JULIO");	// si el valor de la variable es 7 mostrara el siguiente mensaje
                           break;
                case 8: System.out.println("AGOSTO");	// si el valor de la variable es 8 mostrara el siguiente mensaje
                           break;
                case 9: System.out.println("SEPTIEMBRE");	// si el valor de la variable es 9 mostrara el siguiente mensaje
                           break;
                case 10: System.out.println("OCTUBRE");		// si el valor de la variable es 10 mostrara el siguiente mensaje
                             break;	
                case 11: System.out.println("NOVIEMBRE");	// si el valor de la variable es 11 mostrara el siguiente mensaje
                             break;
                case 12: System.out.println("DICIEMBRE");	// si el valor de la variable es 12 mostrara el siguiente mensaje
                             break;
                default : System.out.println("Mes no válido");  // si el valor de la variable no es ninguna de las anteriores mostrara el siguiente mensaje por defecto                  
        }
    }
}
