package aula8.Ex3;

public class Aniversario extends CartaoPresente {

    public void showMessage() {
        System.out.println("Feliz Aniversário, " + getDestinatario());
    }

    //Construtor - tem que estar dentro da classe
    public Aniversario (String nomeDestinatario) {
        super(nomeDestinatario);
    }
    }
