package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next(); // Limpiar entrada inválida
        }
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}