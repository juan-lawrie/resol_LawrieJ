package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio4 {
    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();
        int contador = 0;
        for (char c : palabra.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        System.out.println("La palabra contiene " + contador + " vocal(es).");
        scanner.close();
    }

    public static void main(String[] args) {
        ejercicio4();
    }
}
   


