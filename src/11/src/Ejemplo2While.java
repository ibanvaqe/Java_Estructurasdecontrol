/*
 * programa que lee un número n y muestra n asteriscos
 */
//importa la clases del paquete de java.util
import java.util.*;
//Clase principal
public class Ejemplo2While {
//arranque del programa
    public static void main(String[] args) {
//la clase Scanner recoge lo intrudocido por el teclado y lo guarda en una variable
        Scanner sc = new Scanner(System.in);
//se define la variable, la variable contador por defecto su valor es 0
        int n, contador = 0;
//muestra por pantalla la siguiente frase
        System.out.print("Introduce un número: ");
//recoge el valor introducido en tipo INT y lo mete en la variable n
        n = sc.nextInt();
//mientras el valor de l avariable contado sea menor que n muestre el valor por pantalla por asteriscos, terminando con un autosuma por cada repeticion del bucle, hasta que el valor de contador sea igual que la varible n, que entonces es cuando terminara el bucle
        while (contador < n){
               System.out.println(" * ");
               contador++;
        }
    }
}
