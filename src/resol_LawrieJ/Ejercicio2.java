package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar(Scanner scanner) {
        System.out.println("Por favor, ingresa un número:");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingresa un número válido.");
            scanner.next(); // Limpiar entrada inválida
        }
        int numero = scanner.nextInt();
        if (numero % 2 == 0 && numero != 0) {
            System.out.println(numero + " es un número par.");
        } else if (numero % 2 != 0) {
            System.out.println(numero + " es un número impar.");
        } else {
            System.out.println("El número ingresado es cero. No es par ni impar.");
        }
    }
}