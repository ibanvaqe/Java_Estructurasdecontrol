/*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */
//clase principal
public class JavaApplication22 {
//arranque del programa
    public static void main(String[] args) {
//se define las variables, en este caso las primera variable tienen el modificador final, que sirve para que a la variable solo se le asigne un valor unica vez
        final int XMAX = 10;
        int x, n;
        //mostrar la cabecera de la tabla
        System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");
//la variable x es 1, si esta es igual o menor que la variable XMAX, entrara dentro de la instruccion, al repetir el ciclo se autosumara la varible x +1
        for (x = 1; x <= XMAX; x++){   //filas
//dentro del ciclo for hay otro for, en el cual nos indica otra condicion, si la variable n es 1 y esta es menor o igual 4, entra dentro y se autosumara la variable n por cada ciclo
             for (n = 1; n <= 4; n++){   //columnas
                  System.out.printf("%10.0f", Math.pow(x,n));
             }
             System.out.println();
        }
    }
}
