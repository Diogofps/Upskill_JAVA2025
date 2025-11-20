/*A classe (base) Jogador deve conter o nome e o número do jogador.
Deve também
ter um metodo para registar cada golo marcado e um inspetor para o número de
golos marcados. FEITO*/

package aula7.Ex3;

//Classe
public class Jogador {
    protected String nome; //protected, não private
    protected int numero;
    protected int golosMarcados;

    //Construtor - tem que estar dentro da classe
    public Jogador (String nome, int numero, int golosMarcados) {
        this.nome = nome;
        this.numero = numero;
        this.golosMarcados = 0;
    }

//Gets - criar inspetor de golos marcados
public int getGolosMarcados() {
    return golosMarcados;
}

public void marcaGolo() {
    this.golosMarcados++; //devo ou não usar o this?
}

@Override
public String toString() {
    return "Jogador: " + nome
            + ", numero: " + numero
            + ", golos marcados: " + getGolosMarcados();
}
}