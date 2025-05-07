package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        String invertida = new StringBuilder(palabra).reverse().toString();
        if (palabra.equalsIgnoreCase(invertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}