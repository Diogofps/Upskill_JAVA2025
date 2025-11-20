package aula8.Ex1;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionario = new Funcionario[4];

        funcionario[0] = new Gerente("Diogo", 123, 800);
        funcionario[1] = new Vendedor("João", 456, 800, 50, 100);
        funcionario[2] = new Assistente("Camilla", 789, 800);
        funcionario[3] = new Assistente ("Cila", 789, 800);

        for(Funcionario f : funcionario){
            System.out.println("O funcionário " + f.getNome() + " recebe " + f.calculaSalario());// imprime o salário de todos os funcionários
        }

    }

}
