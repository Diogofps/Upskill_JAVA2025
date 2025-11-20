package aula4;

public class Fibonacci {
    public static int iteracoes = 0;

    public static void main(String[] args) {
        System.out.println(fibonacci(35));
        System.out.println("Total de iterações: " + iteracoes);
    }

    public static int fibonacci(int n) {
        iteracoes++;
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Caso recursivo
        }
    }
}