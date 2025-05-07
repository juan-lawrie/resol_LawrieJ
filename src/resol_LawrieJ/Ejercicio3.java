package resol_LawrieJ;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ejercicio3();
    }

    public static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}
