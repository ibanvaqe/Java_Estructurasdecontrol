/* Programa que lea dos números por teclado y los muestre por pantalla.
 */
import java.util.*; //importa todas las clases de Java 
public class Ejemplo1 {  			//Clase principal del programa
    public static void main(String[] args){	//Arranque del programa
        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);	//Clase Scanner que recojera lo que se introduzca por el teclado
        //leer el primer número
        System.out.println("Introduce un número entero: ");  //Muestra por pantalla la siguiente frase
        n1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo número
        System.out.println("Introduce otro número entero: ");	//Muestra por pantalla la siguiente frase
        n2 = sc.nextInt();      //lee un entero por teclado
       
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);	//Muestra por pantalla el valor de las variables recogidas
    }
}
