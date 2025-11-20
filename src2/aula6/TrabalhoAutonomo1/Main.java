/*Pretende-se desenvolver um programa que simula uma playlist de
músicas. A cada música está associado o título e a duração da mesma.
A playlist guarda uma lista de músicas e deverá permitir as seguintes operações:
a. mostrar a lista de músicas atualmente na playlist
b. acrescentar ou retirar músicas à playlist
c. calcular a duração total de todas as músicas contidas na playlist.*/

package aula6.TrabalhoAutonomo1;

//Classe
public class Main {
    static void main(String[] args) {

        Musica m = new Musica("titulo1",1);
        System.out.println("Titulo da música 1: " + m.getTitulo() + ". Duração da música 1: " + m.getDuracao() + " min.");
    }



}
