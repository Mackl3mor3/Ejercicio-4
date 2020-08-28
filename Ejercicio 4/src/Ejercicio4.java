/*
Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que se
llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los
elementos introducidos).
 */



import java.util.Scanner;

public class Ejercicio4 {
    //definimos el vector

    int[] vector;

    Scanner scanner;

    int n;
    int i;

    //metodo constructor
    public Ejercicio4() {


        n = 10; // segunda linea
        i = 0; // tercera linea

        vector = new int[n]; // cuarta linea

    }

    //metodo ejecutar

    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        boolean negativeFound = false;

        while (!negativeFound) {

            System.out.println("ingrese 10 numeros:");



            for (int i = 0; i < n; i++) {

                int a = scanner.nextInt();

                if (a<0)
                     break;

                vector[i] = a;

            } break;


        }



    }

}
