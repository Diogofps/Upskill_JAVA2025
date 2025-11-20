package aula8.Ex1;

//Classe
public class Gerente extends Funcionario {

    //Construtor - tem que estar dentro da classe
    public Gerente(String nome, int codFuncionario, int salarioBase){
        super(nome, codFuncionario, salarioBase);
    }

    @Override
    public double calculaSalario(){
        return getSalario()*2;
    }
}
