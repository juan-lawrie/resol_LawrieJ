package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de Temperatura");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese grados Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Equivale a " + fahrenheit + " °F");
                break;
            case 2:
                System.out.print("Ingrese grados Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Equivale a " + celsius + " °C");
                break;
            default:
                System.out.println("Opción inválida.");
        }
        sc.close();
    }
}

