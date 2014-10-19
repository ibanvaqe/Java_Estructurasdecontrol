/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
//clase principal
public class Ejemplo3For {
//arrarnque del programa
    public static void main(String[] args) {
//se define las variables
        int a, b;
//en esta instruccion , las variables a y b son 1, al hacer el calculo de suma si es menor que 10, que se autosume de 1 en 1 la variable a y la variable de 2 en 2 , cada vez que se repita el ciclo.
        for(a = 1, b = 1; a + b < 10; a++, b+=2){
//hace y muestra el calculo por pantalla
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}
