/*
9. Criar uma função que peça ao utilizador o dia, o mês de nascimento e
devolva uma string com o signo correspondente. Neste exercício é
necessário utilizar o scanner para pedir o dia e o mês de nascimento
ao utilizador e utilizar o if-else para ver todas as possibilidades de
signos.
*/

package aula3;

import java.util.Scanner;
public class TrabalhoAutonomo9 {
    static void main(String[] args) {
        System.out.println("O teu signo é " +signo() +".");
    }

    public static String signo(){
        Scanner s= new Scanner(System.in); // Cria o Scanner para ler input
        System.out.println("Qual o dia?"); // Pede a nota ao utilizador
        int dia = s.nextInt(); // Lê o número inteiro (nextInt) que o utilizador escreveu
        System.out.println("Qual o mês?");
        int mes = s.nextInt();

            if ((dia >= 22 && dia <=31 && mes ==12) ||
                (dia >= 1 && dia <=20 && mes ==1)){
            return "Capricórnio";
            }
            return "A data não é válida.";
}
}
