package aula8.Ex3;

public class DiaDosNamorados extends CartaoPresente {
    public String destinatario;

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    public void showMessage() {
        System.out.println("Feliz Dia dos Namorados");
    }


}
