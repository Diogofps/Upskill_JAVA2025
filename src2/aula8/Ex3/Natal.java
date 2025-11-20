package aula8.Ex3;

public class Natal extends CartaoPresente {

    public void showMessage(){
        System.out.println("Feliz Natal, " + getDestinatario());
    }

    //Construtor - tem que estar dentro da classe
    public Natal (String nomeDestinatario) {
        super(nomeDestinatario);
    }



}
