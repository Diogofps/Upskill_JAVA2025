package aula8.Ex3;

public class DiaDosNamorados extends CartaoPresente {

    public void showMessage(){
        System.out.println("Feliz Dia dos Namorados, " + getDestinatario());
    }

    //Construtor - tem que estar dentro da classe
    public DiaDosNamorados (String nomeDestinatario) {
        super(nomeDestinatario);
    }


}
