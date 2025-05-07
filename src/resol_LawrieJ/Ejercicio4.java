package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar(Scanner scanner) {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();
        int contador = 0;
        for (char c : palabra.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println("La palabra contiene " + contador + " vocal(es).");
    }
}
   


