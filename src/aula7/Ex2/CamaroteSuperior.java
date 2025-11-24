package aula7.Ex2;

public class CamaroteSuperior extends VIP{

    public int valorCamaroteSup;

    public CamaroteSuperior(int valor){
    super(valor);
    this.valorCamaroteSup= super.getValor()+20;
    }

    @Override
    public int getValor() {
        return valorCamaroteSup;
    }
}
