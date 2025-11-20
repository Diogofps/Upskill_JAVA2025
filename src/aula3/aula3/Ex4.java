// Exercicio 4
package aula3;
import java.util.Scanner;
public class Ex4 {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Programa super complexo para definir se um número é positivo ou negativo. \nIntroduz um número:");
        int num = keyboard.nextInt();
            if (num > 0){
                System.out.println("O teu número é positivo");
            } else if (num < 0) {
                System.out.println("O teu número é negativo");
            } else {
            System.out.println("Nem um nem outro, é zero (⌐■_■)");
        }
    }
}