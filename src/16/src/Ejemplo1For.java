/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
//clas principal
public class Ejemplo1For {
//arranque del programa
    public static void main(String[] args) {
//se define las variables, en este caso las primeras 3 variables tienen el modificador final, que sirve para que a la variable solo se le asigne un valor unica vez
        final int VALOR_INICIAL = 10; // limite inf. tabla
        final int VALOR_FINAL = 100; // limite sup. tabla
        final int PASO = 10 ; // incremento
        int fahrenheit;
        double celsius;
//el valor de la variable VALOR_INICIAL es recogida por la variable fahrenheit
        fahrenheit = VALOR_INICIAL;
//Muestra por pantalla la siguiente frase
        System.out.printf("Fahrenheit \t Celsius \n");
//
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) {
             celsius = 5*(fahrenheit - 32)/9.0;
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}
