package aula8.Ex1;

public class Assistente extends Funcionario {

    public Assistente(String nome, int codFuncionario, int salarioBase){
    super(nome, codFuncionario, salarioBase);
    }

    @Override
    public double calculaSalario(){
        return getSalario();
    }
}
