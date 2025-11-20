package aula3;

public class Ex1 {
    public static int roundNumber(double num) {
        int parte_inteira = (int) num;
        double parte_decimal = num - parte_inteira;
        if (parte_decimal < 0.5) {
            return parte_inteira;
        } else {
            return parte_inteira + 1;
        }
    }

    static void main(String[] args) {
        System.out.println(roundNumber(9.4));
        System.out.println(roundNumber(9.7));
    }
}