/*
Crie a classe Filme que vai ter os seguintes atributos: pontuação, nome e
ano. Defina a ordem natural da classe Filme de acordo com os seguintes
critérios:
1. Ordene os seguintes filmes por ordem crescente do seu ano;
2. em caso de empate, ordene por ordem decrescente em relação à sua
pontuação.
Filmes:
● Force Awakens, 8, 2015
● Star Wars, 9, 1977
● Empire Strikes Back, 7, 1980
● Return of the Jedi, 10, 1983

*/

package aula11.Ex3;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Filme[] listaFilmes = new Filme[3];
        listaFilmes[0] = new Filme(8, "Force Awakens", 2015);
        listaFilmes[1] = new Filme(9, "Empire Strikes Back", 1980);
        listaFilmes[2] = new Filme(10, "Return of the Jedi", 1983);

        Arrays.sort(listaFilmes);

        System.out.println("Ordenado por ano:");
        for (int i = 0; i < listaFilmes.length; i++) {
            System.out.println(listaFilmes[i].getPontuacao() + ", " + listaFilmes[i].getNome() + ", " +
                    listaFilmes[i].getAno());
        }
    }
}
