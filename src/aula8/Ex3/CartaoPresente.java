package aula8.Ex3;

public abstract class CartaoPresente {
    public String destinatario;

    public CartaoPresente(String destinatario) {
        this.destinatario = destinatario;
    }
    public abstract void showMessage();
    public String getDestinatario() {
        return destinatario;

    }
}
