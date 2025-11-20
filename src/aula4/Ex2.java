//Escreva uma função que pesquisa num vetor de inteiros, a existência de um determinado valor inteiro

package aula4;
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9};
        //int valor = 5; //podia usar isto para testar se o código funciona, antes de criar o scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que valor queres procurar no vetor?");
        int valor = scanner.nextInt();

        if (exists(valor, vetor)) {
            System.out.println("O valor " + valor + " existe no vetor.");
        } else {
            System.out.println("O valor " + valor + " não existe no vetor.");
        }
    }

    public static boolean exists(int a, int[] v) {
        int i = 0;
        while (i < v.length) {
            if (v[i] == a) {
                return true;
            }
            i = i + 1;
        }
        return false;
    }
}