/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;	//importa todas las clases del paquete java.util
import java.io.*;	//importa todas las clases del paquete java.io
//clase principal
public class  Ejemplo1Switch {	
//Arranque del programa con una excepcion, para que nos exceptue los errores de entrada y salida
    public static void main(String[] args) throws IOException{
//define las variables de tipo Integer , a la variable Resultado le da un valor por defecto que es 0
        int A,B, Resultado = 0 ;	
//define la variable operador de tipo char
        char operador;
//define la variable calculado con el valor true y de tipo boolean, que son  0 o 1 (True o false)
        boolean calculado = true;
//Clase Scanner recogera lo que se introduzca por el teclado
        Scanner sc = new Scanner(System.in);
//Muestra por pantalla la siguiente frase	
        System.out.print("Introduzca un numero entero:");
//Se recoge el valor en tipo Entero y lo guarda en la variable A  
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
//Se recoge el valor en tipo Entero y lo guarda en la variable B
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");
//Se recoge el operador que hemos introducido y lo guarda en la variable operador con el tipo char. El metodo read nos lo devuelve en decimal, y nos permite leer un unico caracter.
        operador = (char)System.in.read();
//El switch es una instruccion 	que nos da un lista de comparaciones  para comparar el valor de nuestro operador con las siguiente lista de operadores. 
        switch (operador) {
//si el operador es - , nos hara el calculo restar del valor de las variables A y B y nos lo metera en la variable Resultado
                case '-' : Resultado = A - B;
                           break;
//si el operador es + , nos hara el calculo sumar del valor de las variables A y B y nos lo metera en la variable Resultado
                case '+' : Resultado = A + B;
                           break;
//si el operador es * , nos hara el calculo multiplicar del valor de las variables A y B y nos lo metera en la variable Resultado
                case '*' : Resultado = A * B;
                           break;
//si el operador es / ,y si el valor de la variable B es diferente a 0 hara el calculo dividir entre la variable A y B y nos lo metera en la variable Resultado, sino nos mostrara un mensaje de no se puede dividir y le daremos a la variable calculado un false. 

                case '/' : if(B!=0)
                              Resultado = A / B;
                           else{
                              System.out.println("\nNo se puede dividir por cero");
                              calculado = false;
                           }
                           break;
//si no se poner ninguno de estos operadores nos mostrara que el operador no es valido y que el calculado(variable) es tambien falso.
                default : System.out.println("\nOperador no valido");
                          calculado = false;
                         
        }
//Si la variable calculado se mantiene en true como hemos puesto por defecto, nos metera dentro y nos mostrara un mensaje de cual es nuestro resultado con la variable resultado
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
