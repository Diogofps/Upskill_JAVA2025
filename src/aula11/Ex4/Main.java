/*
Crie a classe Livro que tem os seguintes atributos: nome, ano, editora e
autor. Implemente 3 comparadores externos que permitem ordenar os
livros por:
1) Ordem alfabética crescente do título
2) Ordem decrescente do ano
3) Ordem alfabética crescente da editora
Livros:
● The Shinning, 1990, Leya, Stephen King
● Harry Potter e a Pedra Filosofal, 2001, ASA, Joanne Rowling
● O Inferno de Dante, 1472, Bertrand, Dante
● Conde de Monte Cristo, 1844, Texto, Alexandre Dumas
● Desenhar Bases de Dados, 2016, Silabo, Pedro Nogueira
 */


package aula11.Ex4;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Livro[] listaLivros = new Livro[5];
        listaLivros[0]= new Livro("The Shinning", 1990,"Leya", "Stephen King");
        listaLivros[1]= new Livro("Harry Potter e a Pedra Filosofal",2001,"ASA", "Joanne Rowling");
        listaLivros[2]= new Livro("O Inferno de Dante",1472,"Bertrand","Dante");
        listaLivros[3]= new Livro("Conde de Monte Cristo", 1844, "Texto", "Alexandre Dumas");
        listaLivros[4]= new Livro("Desenhar Base de Dados", 2016, "Silabo", "Pedro Nogueira");

        ComparadorLivroAno c = new ComparadorLivroAno();
        Arrays.sort(listaLivros, c);

        for (int i = 0; i < listaLivros.length; i++) {
        System.out.println("Ordenado por ano");
        System.out.println(listaLivros[i].getAno() + ", " + listaLivros[i].getNome() + ", " + listaLivros[i].getEditora());
        }
    }
}


