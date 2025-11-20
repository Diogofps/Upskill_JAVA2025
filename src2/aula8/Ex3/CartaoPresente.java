/*
Escreva uma classe abstrata chamada CartaoPresente.
Essa classe representa todos os tipos de cartões presente
e conterá apenas um atributo: destinatario (tipo String).
Nessa classe, deverá também ser declarado o metodo
public abstract void showMessage()

Crie classes filhas da classe CartaoPresente: DiaDosNamorados, Natal e Aniversário. Cada
uma dessas classes deve conter um metodo construtor que receba o nome do
destinatário do cartão. Cada classe também deverá implementar o metodo
showMessage(), mostrando uma mensagem ao utilizador com seu nome e que seja
específica para a data de comemorativa do cartão.

Teste a sua implementação criando instâncias dos 3 tipos de cartões. Depois, exiba as
mensagens desses cartões chamando o metodo showMessage().
 */

package aula8.Ex3;

//Classe
public abstract class CartaoPresente {
    private String destinatario;
    public abstract void showMessage();

    //Construtor - tem que estar dentro da classe
    public CartaoPresente (String destinatario) {
        this.destinatario = destinatario;
    }

    //Gets - criar inspetor de golos marcados
    public String getDestinatario() {
        return destinatario;
    }
}