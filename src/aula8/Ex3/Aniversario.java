package aula8.Ex3;

public class Aniversario extends CartaoPresente {
    public String destinatario;

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    public void showMessage() {
        System.out.println("Feliz Aniversário");
    }

    @Override
    public String toString() {
        return "Aniversario{" +
                "destinatario='" + destinatario + '\'' +
                '}';
    }
}
