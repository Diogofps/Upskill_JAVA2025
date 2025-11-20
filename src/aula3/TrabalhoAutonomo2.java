// 2. Criar uma função que divide dois números. Caso a divisão seja por zero, a função deve devolver 0

package aula3;

import java.util.Scanner;
public class TrabalhoAutonomo2 {
    static void main(String[] args) {
        Scanner divisao = new Scanner(System.in);
        System.out.println("Diz-me dois números para dividir. \n Primeiro nùmero:");
        int num1 = divisao.nextInt();
        System.out.println("Segundo número:");
        int num2 = divisao.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("O resultado é: " +resultado);
        } else {
            System.out.println("Não podes dividir por 0");
        }
    }
}