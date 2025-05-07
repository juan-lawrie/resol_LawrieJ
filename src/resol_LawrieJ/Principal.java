package resol_LawrieJ;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Instancia única de Scanner
        int opcion;

        do {
            System.out.println("=== Menú de Ejercicios ===");
            for (int i = 1; i <= 14; i++) {
                System.out.println(i + ". Ejercicio " + i);
            }
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            // Validar entrada del usuario
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar entrada inválida
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer después de leer el número

            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar(scanner);
                    break;
                case 2:
                    Ejercicio2.ejecutar(scanner);
                    break;
                case 3:
                    Ejercicio3.ejecutar(scanner);
                    break;
                case 4:
                    Ejercicio4.ejecutar(scanner);
                    break;
                case 5:
                    Ejercicio5.ejecutar(scanner);
                    break;
                case 6:
                    Ejercicio6.ejecutar(scanner);
                    break;
                case 7:
                    Ejercicio7.ejecutar(scanner);
                    break;
                case 8:
                    Ejercicio8.ejecutar(scanner);
                    break;
                case 9:
                    Ejercicio9.ejecutar(scanner);
                    break;
                case 10:
                    Ejercicio10.ejecutar(scanner);
                    break;
                case 11:
                    Ejercicio11.ejecutar(scanner);
                    break;
                case 12:
                    Ejercicio12.ejecutar(scanner);
                    break;
                case 13:
                    Ejercicio13.ejecutar(scanner);
                    break;
                case 14:
                    Ejercicio14.ejecutar(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println(); // Línea en blanco para separar iteraciones
        } while (opcion != 0);

        scanner.close();
    }
}