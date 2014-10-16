/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
//importa todas las clases del paquete java.util
import java.util.*;
//Clase Principal
public class Ejemplo1While {
//Arranque del programa
    public static void main(String[] args) {
//Se define las variables de tipo INT, suma tiene un valor 0 por defecto
        int suma = 0, num;
//Clase Scanner recogera lo que se introduzca por el teclado 
        Scanner sc = new Scanner(System.in);
//Muestra por pantalla que introduzcamos un numero
        System.out.print("Introduzca un número: ");
//Se recoge el valor en tipo INT, y lo metemos en la variable num
        num = sc.nextInt();
//Hace un bucle que si el valor de la variable es igual o mayor que 0 que entre en el
        while (num >= 0){
//Se hace un calculo de suma enter las variables suma y num, el valor del calculo se mete en la variable suma
               suma = suma + num;
//nos muestra un mensaje para introducir otro numero
               System.out.print("Introduzca un número: ");
//lo recoge en tipo INT y lo mete en num
               num = sc.nextInt();
        }
//nos muestra un mensaje que el valor de la suma es el valor de la variable suma
        System.out.println("La suma es: " + suma );
    }
}
