package aula5;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        System.out.println(signo());
        ordenar(1, 2, 3);
        System.out.println("Opção 2");
    }

    public static int areaPrisma(int a, int c, int l) {
        int area1 = c * a;
        int area2 = l * a;
        int area3 = c * l;
        return 2 * area1 + 2 * area2 + 2 * area3;
    }

    public static double arredondarXcasas(double a, double b) {
        double aux = Math.pow((double)10.0F, b);
        return (double)Math.round(a * aux) / aux;
    }

    public static double divisao(double a, double b) {
        return b == (double)0.0F ? (double)0.0F : a / b;
    }

    public static boolean par(int a) {
        return a % 2 == 0;
    }

    public static boolean positive(int a) {
        return a >= 0;
    }

    public static void leitura() {
        Scanner s = new Scanner(System.in);
        String texto = s.nextLine();
        System.out.println(texto);
    }

    public static int numeroRodas() {
        System.out.println("Qual o tipo de veículo? ");
        Scanner s = new Scanner(System.in);
        switch (s.nextLine()) {
            case "automóvel" -> {
                return 4;
            }
            case "mota" -> {
                return 2;
            }
            case "bicicleta" -> {
                return 2;
            }
            default -> {
                return 0;
            }
        }
    }

    public static String nota(int nota) {
        if (nota <= 100 && nota >= 90) {
            return "Excelente";
        } else if (nota < 90 && nota >= 80) {
            return "Muito Bom";
        } else {
            return nota < 80 && nota >= 0 ? "Ok" : "Não Ok";
        }
    }

    public static String signo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o dia?");
        int day = s.nextInt();
        System.out.println("Qual o mês?");
        int mes = s.nextInt();
        return (day < 22 || day > 31 || mes != 12) && (day < 1 || day > 21 || mes != 1) ? "A data não é válida" : "Capricórnio";
    }

    public static void ordenar(int v1, int v2, int v3) {
        if (v1 > v2 && v1 > v3) {
            if (v2 > v3) {
                System.out.println("A" + v3 + "\n" + v2 + "\n" + v1);
            } else {
                System.out.println("B" + v2 + "\n" + v3 + "\n" + v1);
            }
        } else if (v2 > v1 && v2 > v3) {
            if (v1 > v3) {
                System.out.println("C" + v3 + "\n" + v1 + "\n" + v2);
            } else {
                System.out.println("D" + v1 + "\n" + v3 + "\n" + v2);
            }
        } else if (v3 > v1 && v3 > v2) {
            if (v1 > v2) {
                System.out.println("E" + v2 + "\n" + v1 + "\n" + v3);
            } else {
                System.out.println("F" + v1 + "\n" + v2 + "\n" + v3);
            }
        }

    }
}
