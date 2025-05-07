package resol_LawrieJ;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio12 {
    public static void ejecutar(Scanner scanner) {
        Integer[] numeros = new Integer[5];
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Ingrese número " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    numeros[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("No se puede ingresar decimales. Por favor, ingrese un número entero.");
                    scanner.next(); // Limpiar entrada inválida
                }
            }
        }

        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("Números ordenados de mayor a menor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}