// Exercicio 5
package aula3;
import java.util.Scanner;
public class Ex5 {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Programa super complexo para descobrir o número mais baixo. \nIntroduz o primeiro número:");
        int num1 = keyboard.nextInt();
        System.out.println("Introduz o segundo número:");
        int num2 = keyboard.nextInt();
        System.out.println("Introduz o terceiro número:");
        int num3 = keyboard.nextInt();

            if (num1 > num2 && num1 > num3)
                System.out.println("Maior: " +num1);
            if (num2 > num1 && num2 > num3)
                System.out.println("Maior: " +num2);
            if (num3 > num2 && num3 > num1)
                System.out.println("Maior: " +num3);
    }
}