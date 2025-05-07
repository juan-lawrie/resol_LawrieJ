package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio9 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese un texto: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String texto = scanner.nextLine();
        int cantidad = contarPalabras(texto);
        System.out.println("Cantidad de palabras: " + cantidad);
    }

    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = texto.trim().split("[\\s\\p{Punct}]+");
        return palabras.length;
    }
}