package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio8 {
    public static void ejecutar(Scanner scanner) {
        System.out.println("Conversor de Temperatura");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Seleccione una opción: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next(); // Limpiar entrada inválida
        }
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese grados Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Equivale a " + fahrenheit + " °F");
                break;
            case 2:
                System.out.print("Ingrese grados Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Equivale a " + celsius + " °C");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}