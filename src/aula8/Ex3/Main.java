/// Escreva uma classe abstrata chamada CartaoPresente. Essa classe representa todos os
/// tipos de cartões presente e conterá apenas um atributo: destinatario (tipo String).
/// Nessa classe, deverá também ser declarado o método public abstract void
/// showMessage().
/// Crie classes filhas da classe CartaoPresente: DiaDosNamorados, Natal e Aniversário. Cada
/// uma dessas classes deve conter um método construtor que receba o nome do
/// destinatário do cartão. Cada classe também deverá implementar o método
/// showMessage(), mostrando uma mensagem ao utilizador com seu nome e que seja
/// específica para a data de comemorativa do cartão.
/// Teste a sua implementação criando instâncias dos 3 tipos de cartões. Depois, exiba as
/// mensagens desses cartões chamando o método showMessage().

package aula8.Ex3;

public class Main {

    static void main(String[] args) {
        CartaoPresente aniversario = new Aniversario("André");
        CartaoPresente diaDosNamorados = new DiaDosNamorados ("Maria");
        CartaoPresente natal = new Natal("João");

        aniversario.showMessage();
        diaDosNamorados.showMessage();
        natal.showMessage();

    }

}
