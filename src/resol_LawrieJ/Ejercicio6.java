package resol_LawrieJ; // Ensure this matches the folder structure: TP1-LawrieJ/src/resol_LawrieJ

import java.util.Scanner;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        ejercicio6();
    }

    public static void ejercicio6() {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100) + 1;
        int intento;
        System.out.println("Adivina el número entre 1 y 100:");
        do {
            System.out.print("Tu intento: ");
            intento = scanner.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Más alto.");
            } else if (intento > numeroSecreto) {
                System.out.println("Más bajo.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número.");
            }
        } while (intento != numeroSecreto);
        scanner.close();
    }
}
