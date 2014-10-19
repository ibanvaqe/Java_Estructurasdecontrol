/*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
//se importa las clases del paquete java.util
import java.util.*;
//clase principal
public class Ejemplo1DoWhile {
//arranque del programa
    public static void main(String[] args) {
//se define la variable
        int valor;
//la clase Scanner recoge lo intrudocido por el teclado y lo guarda en una variable
        Scanner in = new Scanner( System.in );
//mostrar en pantalla la siguiente frase y recogerla en una variable , despues compararla con la condicion del while, si el valor es igual o mayor que 100, se termina el ciclo, sino vuelve a realizar el ciclo.
        do {
            System.out.print("Escribe un entero < 100: ");
            valor = in.nextInt();
        }while (valor >= 100);
//muestra por pantalla el valor introducido
        System.out.println("Ha introducido: " + valor);
    }
}
