package aula7.Ex2;

public class VIP extends Ingresso{
    public int valorVIP;


    public VIP(int valor) {
        super(valor);
        this.valorVIP = valor+20;
    }

    public int getValor() {
        return valorVIP;
    }
}
