package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int a = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    int x = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int y = sc.nextInt();
                    System.out.println("Resultado: " + (x - y));
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
        sc.close();
    }
}

