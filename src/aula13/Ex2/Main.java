package aula13.Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scannerUser = new Scanner(System.in); // criei Scanner
        System.out.println("Introduz o teu nome:");
        String nome = scannerUser.nextLine();
        System.out.println("Introduz a tua idade:");
        String idade = scannerUser.nextLine(); // aqui já tenho os dados do user, mas ainda não os guardei

        try { // primeira parte do exercício
            PrintWriter p = new PrintWriter(new File("ficheiroUsers.txt")); // crio o ficheiro
            p.println(nome + ";" + idade); // peço para guardar o nome e idade em "ficheiroUsers.txt"
            p.close(); // fecha o ficheiro depois de escrever lá dentro
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível criar o ficheiro!");
        }

        try { // segunda parte do exercício
            File f = new File("ficheiroUsers.txt"); // Cria um objeto que representa o “ficheiroUsers.txt”
            Scanner s2 = new Scanner(f); // Cria um leitor para abrir e ler o conteúdo do ficheiro
            String pessoa = s2.nextLine(); // Lê a primeira linha do ficheiro e guarda-a na variável pessoa
            String[] pessoaAtributos = pessoa.split(";"); // Divide a linha em partes, usando o ponto e vírgula como separador
            System.out.println("Eu sou o " + pessoaAtributos[0] + " e tenho " + pessoaAtributos[1] + " anos.");

        } catch (FileNotFoundException e) {}
        System.out.println();
    }
}
