package resol_LawrieJ;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio6 {
    public static void ejecutar(Scanner scanner) {
        int numeroSecreto = new Random().nextInt(100) + 1;
        int intento;
        System.out.println("Adivina el número entre 1 y 100:");
        do {
            System.out.print("Tu intento: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar entrada inválida
            }
            intento = scanner.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Más alto.");
            } else if (intento > numeroSecreto) {
                System.out.println("Más bajo.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número.");
            }
        } while (intento != numeroSecreto);
    }
}