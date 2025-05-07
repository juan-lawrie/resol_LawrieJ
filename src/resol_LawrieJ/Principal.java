package resol_LawrieJ;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú de Ejercicios ===");
            for (int i = 1; i <= 14; i++) {
                System.out.println(i + ". Ejercicio " + i);
            }
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
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

    public static void ejercicio1() {
        System.out.println("Ejecutando el Ejercicio 1...");
        // Lógica del Ejercicio 1
    }

    public static void ejercicio2() {
        System.out.println("Ejecutando el Ejercicio 2...");
        // Lógica del Ejercicio 2
    }

    public static void ejercicio3() {
        System.out.println("Ejecutando el Ejercicio 3...");
        // Lógica del Ejercicio 3
    }

    public static void ejercicio4() {
        System.out.println("Ejecutando el Ejercicio 4...");
        // Lógica del Ejercicio 4
    }

    public static void ejercicio5() {
        System.out.println("Ejecutando el Ejercicio 5...");
        // Lógica del Ejercicio 5
    }

    public static void ejercicio6() {
        System.out.println("Ejecutando el Ejercicio 6...");
        // Lógica del Ejercicio 6
    }

    public static void ejercicio7() {
        System.out.println("Ejecutando el Ejercicio 7...");
        // Lógica del Ejercicio 7
    }

    public static void ejercicio8() {
        System.out.println("Ejecutando el Ejercicio 8...");
        // Lógica del Ejercicio 8
    }

    public static void ejercicio9() {
        System.out.println("Ejecutando el Ejercicio 9...");
        // Lógica del Ejercicio 9
    }

    public static void ejercicio10() {
        System.out.println("Ejecutando el Ejercicio 10...");
        // Lógica del Ejercicio 10
    }

    public static void ejercicio11() {
        System.out.println("Ejecutando el Ejercicio 11...");
        // Lógica del Ejercicio 11
    }

    public static void ejercicio12() {
        System.out.println("Ejecutando el Ejercicio 12...");
        // Lógica del Ejercicio 12
    }

    public static void ejercicio13() {
        System.out.println("Ejecutando el Ejercicio 13...");
        // Lógica del Ejercicio 13
    }

    public static void ejercicio14() {
        System.out.println("Ejecutando el Ejercicio 14...");
        // Lógica del Ejercicio 14
    }
}
