/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
//Importa las clases del paquete java.util
import java.util.*;
//clase principal
public class Ejemplo2DoWhile{
//arranque del programa
    public static void main(String[] args) {
//se define la variable
        int n;
//la clase Scanner recoge lo intrudocido por el teclado y lo guarda en una variable
        Scanner sc = new Scanner( System.in );
//la primera secuencia que hace es mostrar en pantalla la siguiente frase y recoger la variable de tipo INT en n. Despues con el while compara la condicion, si n es menor que 1 o mayor 10 volver a ejecutar el ciclo, sino mostrarla por pantalla.
        do {
            System.out.print("Escribe un número entre 1 y 10: ");
            n = sc.nextInt();
        }while (n<1 || n >10);
        System.out.println("Ha introducido: " + n);
    }
}
