/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
//clase principal
public class Ejemplo3While {
//arranque del programa
    public static void main(String[] args) {
//se define las variables, en este caso las primeras 3 variables tienen el modificador final, que sirve para que a la variable solo se le asigne un valor unica vez
        final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento
        int fahrenheit;
        double celsius;
// el valor de la variable VALOR_INICIAL se recoge en la variable fahrenheit
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");
//hace un bucle mientras que el valor de la variable fahrenheit se igual o menor que la variable VALOR_FINAL
        while (fahrenheit <= VALOR_FINAL ){
//se hace un calculo y se recoge en la variable
               celsius = 5*(fahrenheit - 32)/9.0;
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
               fahrenheit += PASO;
        }
    }
}

