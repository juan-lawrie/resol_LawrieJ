package resol_LawrieJ;
import java.util.Scanner;

public class fibonacciRecursivo {

        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt(); // Cambia este valor para calcular otros términos
        System.out.println("El término " + n + " de la serie Fibonacci es: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int fibonacciIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static int fibonacciMemoizado(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n <= 1) {
            return n;
        }
        memo[n] = fibonacciMemoizado(n - 1, memo) + fibonacciMemoizado(n - 2, memo);
        return memo[n];
    }
    public static int fibonacciMemoizado(int n) {
        int[] memo = new int[n + 1];
        return fibonacciMemoizado(n, memo); 
   
}}
