/*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
//importa las clase del paquete de java.util
import java.util.*;
//clase principal
public class Ejemplo20 {
//arranque del programa
    public static void main(String[] args) {
//La clase scanner recogera lo introducido por teclado y lo guarda en la variable sc
        Scanner sc = new Scanner(System.in);
//se define las variable
        int filas, columnas;
        //leer número de filas hasta que sea un número > 0
        do{
           System.out.print("Introduce número de filas: ");
           filas = sc.nextInt();
        }while(filas<1);
        //leer número de columnas hasta que sea un número > 0
        do{
           System.out.print("Introduce número de columnas: ");
           columnas = sc.nextInt();
        }while(columnas<1);
//la varibale i es 1, si esta es menor o igual que el valor de la variable filas que se vaya autosumando hasta llegar al mismo valor que las de filas
        for(int i = 1; i<=filas; i++){    //filas
//la varibale i es 1, si esta es menor o igual que el valor de la variable filas que se vaya autosumando hasta llegar al mismo valor que las de filas
            for(int j = 1; j<=columnas; j++){   //columnas
                 System.out.print(" * ");
            }
            System.out.println();
        }
       
    }
}
