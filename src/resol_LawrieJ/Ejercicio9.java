package resol_LawrieJ;

public class Ejercicio9 {
    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = texto.trim().split("[\\s\\p{Punct}]+");
        return palabras.length;
    }

    public static void main(String[] args) {
        String texto = "Tres tristes tigres tragan trigo en un trigal.";
        int cantidad = contarPalabras(texto);
        System.out.println("Cantidad de palabras: " + cantidad);
    }
}

