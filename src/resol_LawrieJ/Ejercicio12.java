package resol_LawrieJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numeros = new Integer[5];

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Ingrese número " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    numeros[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("No se puede ingresar decimales. Por favor, ingrese un número entero.");
                    sc.next(); // Clear invalid input
                }
            }
        }

        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Números ordenados de mayor a menor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

//Cuando se ingrese un numero con coma mostrar un mensaje diciendo: "que no se puede ingresar decimales y que por favor ingrese un numero entero" y volver a pedir el numero.


