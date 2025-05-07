package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar entrada inválida
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    int x = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int y = scanner.nextInt();
                    System.out.println("Resultado: " + (x - y));
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}