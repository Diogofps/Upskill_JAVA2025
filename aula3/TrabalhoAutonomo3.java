//3. Criar uma função que devolve verdadeiro se o número dado for par. (Ex: isEven(6) -> true).
package aula3;
import java.util.Scanner;
public class TrabalhoAutonomo3 {
    public static boolean isEven(int numero) {
        return numero % 2 == 0;
    }
    static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Inserir número:");
        int numero = num.nextInt();
        if (isEven(numero)) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}



