package aula8.Ex1;

public class Vendedor extends Funcionario {

    public int vendas;

    public Vendedor(String nome, String codFuncionario, double salarioBase, int vendas) {
        super(nome, codFuncionario, salarioBase);
        this.vendas=vendas;
        setSalarioBase(getSalarioBase() +200);
    }

    public int getVendas() {
        return vendas;
    }
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    @Override
    public double calculaSalario() {
        if(vendas>10){
            return salarioBase + 100;
        }else{
            return salarioBase;
        }
    }


}
