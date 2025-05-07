package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor, ingresa un número:");
            int numero = scanner.nextInt(); // Ahora se usa Scanner para leer el número
            if (numero % 2 == 0 && numero != 0) {
                System.out.println(numero + " es un número par.");
            } else if (numero % 2 != 0) {
                System.out.println(numero + " es un número impar.");
            } else {
                System.out.println("El número ingresado es cero. No es par ni impar.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}