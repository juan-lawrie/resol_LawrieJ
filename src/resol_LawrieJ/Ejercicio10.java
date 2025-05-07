package resol_LawrieJ;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña para validar: ");
        String contrasena = scanner.nextLine();
        boolean esSegura = validarContrasena(contrasena);
        if (esSegura) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }

    public static boolean validarContrasena(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                tieneCaracterEspecial = true;
            }
        
        }

        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial;
    }
}
