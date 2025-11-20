//4. Criar uma função que devolve verdadeiro se o número dado é positivo e falso caso contrário. (Ex: isPositive(-45) -> false).
package aula3;
import java.util.Scanner;
public class TrabalhoAutonomo4 {
   /*
    static boolean isPositive(int num2) {
        return num2 > 0;
    }
    static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Inserir número:");
        int num2 = num.nextInt();
        if (isPositive(num2)) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo ou zero.");
        }
    }
}
*/
static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("Inserir número:");
    int num2 = num.nextInt();
    System.out.println(num2);
}

static boolean isPositive(int num2) {
    if (num2 > 0){
        return true;
    }else{
        return false;
    }
}}