 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */
//importa todas las clases del paquete java.util
import java.util.*;
//Clase Principal		
public class Ejemplo1OperadorCondicional {
//Arranque del programa
    public static void main(String[] args) {
//Clase Scanner recogera lo que se introduzca por el teclado
        Scanner sc = new Scanner(System.in);
//Se define la variable de tipo INT
        int num;      
//Muestra un mensaje por pantalla en el cual introducimos un numero
        System.out.println("Introduzca numero: ");
//Se recoge el valor en tipo INT y lo mete en la variable num
        num = sc.nextInt();
//Nos muestra por pantalla si es par o impar, el mismo calculo se inserta dentro del parametro
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
