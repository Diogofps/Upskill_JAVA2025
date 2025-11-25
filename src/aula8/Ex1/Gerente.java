package aula8.Ex1;

public class Gerente extends Funcionario {

    public Gerente(String nome, String codFuncionario, double salarioBase) {
        super(nome, codFuncionario, salarioBase);
        setSalarioBase(getSalarioBase() *2);
    }

    @Override
    public double calculaSalario() {
        return salarioBase;
    }

}
