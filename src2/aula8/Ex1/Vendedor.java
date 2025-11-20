package aula8.Ex1;

public class Vendedor extends Funcionario {

    private double comissaoVendas;
    private double valorVendas;

    public Vendedor(String nome, int codFuncionario, int salarioBase, double comissaoVendas, double valorVendas){
        super(nome,codFuncionario,salarioBase);
        this.comissaoVendas = comissaoVendas;
        this.valorVendas = valorVendas;
    }

    @Override
    public double calculaSalario(){
        return getSalario() + comissaoVendas;
    }

}

