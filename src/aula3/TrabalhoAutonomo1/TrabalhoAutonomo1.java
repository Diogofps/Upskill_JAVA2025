//1. Criar uma função que dado o ano de nascimento devolve a idade
// resolvi de uma forma simples primeiro, e adicionei nos comentários outra forma, com classes que ainda não estudámos em aula.

package aula3.TrabalhoAutonomo1;
import java.util.Scanner; // Importa a classe Scanner, que serve para ler dados do teclado/interação do utilizador
// import java.time.LocalDate; - Importa a classe LocalDate, descobre a data de hoje
// import java.time.Period; -  Importa a classe Period, calcula diferenças entre duas datas
public class TrabalhoAutonomo1 {
    static void main(String[] args) {
        Scanner idade = new Scanner(System.in);
        System.out.println("Programa super complexo para descobrir a tua idade. \nEm que ano nasceste?");
            int ano = idade.nextInt();

        // System.out.println("E em que mês?");
        //    int mes = idade.nextInt();
        // System.out.println("E o dia?");
        //    int dia = idade.nextInt();

        // Cria datas de nascimento e data atual
                // LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
                // LocalDate dataAtual = LocalDate.now();
        // Calcula a idade considerando ano, mês e dia
                // int idade = Period.between(dataNascimento, dataAtual).getYears();

            int idade2 = (2025 - ano);
            System.out.println("Tens " +idade2 +" anos!");
    }
}