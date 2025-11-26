package aula8.Ex3;

public class Natal extends CartaoPresente {
    public String destinatario;

    public Natal (String destinatario) {
        super(destinatario);
    }

    public void showMessage() {
        System.out.println("Feliz Natal");
    }


}
