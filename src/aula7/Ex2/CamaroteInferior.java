package aula7.Ex2;

public class CamaroteInferior extends VIP{

    public String localizacao;
    public int valorCamaroteInf;

    public CamaroteInferior(int valor, String localizacao) {
       super(valor);
       this.valorCamaroteInf = valorVIP + 40;
       this.localizacao=localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public int getValor() {
        return valorCamaroteInf;
    }
}
