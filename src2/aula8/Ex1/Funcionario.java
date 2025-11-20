/*Crie uma hierarquia de classes para representar os diferentes tipos de funcionários de um
escritório que tem os seguintes cargos: gerente, assistente e vendedor. Escreva uma
classe base abstrata chamada Funcionário que declara um metodo abstrato: double calculaSalario()

Esta classe também deve definir os seguintes atributos: nome (tipo String), código de
funcionário (tipo String) e salario base (tipo double).

Crie um construtor que recebe os valores a serem armazenados nos respectivos atributos.
Esta classe abstrata deverá ser estendida pelas outras classes representativas dos tipos de funcionários. Em cada classe
deve-se redefinir o método calculaSalario() de forma que o cálculo do salário seja feito
da seguinte forma: o gerente recebe duas vezes o salario_base, o assistente recebe o
salário_base e o vendedor recebe o salario_base mais uma comissão definida no
momento de inicialização.
Teste a sua implementação criando um objeto de cada tipo e imprima
para o ecrã os salários de cada um.*/

package aula8.Ex1;

//Classe
public abstract class Funcionario {
    private String nome;
    private int codFuncionario;
    private int salarioBase;
    // private int salarioBase = 800;

//Construtor - tem que estar dentro da classe
    public Funcionario (String nome, int codFuncionario, int salarioBase) {
        this.nome = nome;
        this.codFuncionario = codFuncionario;
        this.salarioBase = salarioBase;
    }

//Gets
    public String getNome() {
        return nome;
    }
    public int getCodFuncionario() {
        return codFuncionario;
    }
    public double getSalario() {
        return salarioBase;
    }

public abstract double calculaSalario();

}
