package resol_LawrieJ;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {
    public static void ejecutar(Scanner scanner) {
        int[][] arreglo = {
            {1, 2, 0, 3, 0, 7},
            {0, 0, 0, 0},
            {0, 6, 9, 8, 0, 9, 6},
            {0, 0, 0, 7, 9, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {8, 7, 0, 8, 9, 0, 8}
        };

        System.out.println("Arreglo original:");
        mostrar(arreglo);

        int[][] resultado = eliminarCeros(arreglo);

        System.out.println("\nArreglo sin ceros y sin filas vacías:");
        mostrar(resultado);
    }

    public static int[][] eliminarCeros(int[][] matriz) {
        ArrayList<int[]> listaFilas = new ArrayList<>();

        for (int[] fila : matriz) {
            ArrayList<Integer> nuevaFila = new ArrayList<>();
            for (int num : fila) {
                if (num != 0) {
                    nuevaFila.add(num);
                }
            }

            if (!nuevaFila.isEmpty()) {
                int[] filaSinCeros = new int[nuevaFila.size()];
                for (int i = 0; i < nuevaFila.size(); i++) {
                    filaSinCeros[i] = nuevaFila.get(i);
                }
                listaFilas.add(filaSinCeros);
            }
        }

        int[][] resultado = new int[listaFilas.size()][];
        for (int i = 0; i < listaFilas.size(); i++) {
            resultado[i] = listaFilas.get(i);
        }

        return resultado;
    }

    public static void mostrar(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}