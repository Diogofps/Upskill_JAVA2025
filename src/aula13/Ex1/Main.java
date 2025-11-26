/*
Crie uma lista de Pessoas com a informação recolhida no ficheiro
pessoas.txt. O conteúdo do ficheiro pessoas.txt está representado abaixo:
João;23;Lisboa
Maria;10;Porto
Rita;21;Gaia
José;39;Aveiro
Manel;25;Portalegre
Ana;33;Alenquer
Alex;19;Sintra
Jacinto;30;Guarda
Vanderlei;45;Portimão
Dica: use o metodo split() da classe String
 */

package aula13.Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> listaDePessoas = new ArrayList<>();
        File f = new File ("alunos.txt"); // criei objecto para representar ficheiro
        try {
            Scanner s = new Scanner(f);
            while(s.hasNextLine()) {
                String alunoString = s.nextLine();
                String[] alunoAtributos = alunoString.split(";"); // criei vetor/array, e defini que o split divide em cada ";"
                int idade = Integer.parseInt(alunoAtributos[1]); // converte String (de alunoAtributos) para int
                Pessoa p = new Pessoa(alunoAtributos[0],idade,alunoAtributos[2]); // cria Pessoa p e seus atributos
                listaDePessoas.add(p); // adiciona Pessoa p à listaDePessoas
            }
        } catch (FileNotFoundException e) {}

        System.out.println("Quantidade de pessoas na lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        System.out.println("Lista das pessoas: ");
        for (Pessoa p : listaDePessoas) {
            System.out.println(p);
        }
    }
}
