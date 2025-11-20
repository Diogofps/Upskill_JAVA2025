// Exercicio 3
package aula3;

public class Ex3 {
    public static String getNumber(int num) {
        switch (num) {
            case 1:
                return "Um";
            case 2:
                return "Dois";
            case 3:
                return "Três";
            default:
                return "Mão consigo identificar";
        }
    }

    public static void printNumber(int num) {
        switch (num) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Não consigo identificar");
        }
    }

    static void main(String[] args) {
        System.out.println();
    }

}



