package resol_LawrieJ;

public class Ejercicio13 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Carlos"};
        double[][] notas = {
            {7.5, 8.0, 9.0},
            {6.0, 5.5, 6.5},
            {9.0, 8.5, 10.0}
        };

        for (int i = 0; i < nombres.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println(nombres[i] + " - Promedio: " + promedio);
        }
    }
}
