/// Pretende-se escrever um programa para registar as estatísticas de jogadores de futebol:
/// ● A classe (base) Jogador deve conter o nome e o número do jogador. Deve também
/// ter um método para registar cada golo marcado e um inspetor para o número de
/// golos marcados.
/// ● A classe GuardaRedes, uma extensão de Jogador, deve permitir registar e consultar o
/// número de golos sofridos.
/// ● A classe JogadorDeCampo, uma extensão de Jogador, deve permitir registar e consultar
/// o número de passes feitos e recebidos.
/// Teste criando um jogador de campo e um guarda-redes e use as funções próprias de
/// cada classe para atribuir a cada jogador (desde que seja possível): 2 golos marcados, 3
/// golos sofridos, 4 passes feitos e 5 passes recebidos.
/// Sobreponha o método toString() em ambas as classes para melhor visualizar os
/// resultados do teste, que devem ser impressos para o ecrâ

package aula7.Ex3;

public class Main {

    public static void main(String[] args) {

    JogadorDeCampo j1 = new JogadorDeCampo("João", 1, 2, 2, 2);
    GuardaRedes j2 = new GuardaRedes("GR Manel", 2, 2, 2);


    System.out.println(j2.toString());
    System.out.println(j1.toString());
    j1.marcaGolo();
    j2.sofreGolo();
    System.out.println(j2.toString());
    System.out.println(j1.toString());

    }
}
