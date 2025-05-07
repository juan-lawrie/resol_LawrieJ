package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio11 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next(); // Limpiar entrada inválida
        }
        int n = scanner.nextInt();
        System.out.println("El término " + n + " de la serie Fibonacci es: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}