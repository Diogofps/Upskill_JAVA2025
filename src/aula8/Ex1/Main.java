/*
Crie uma hierarquia de classes para representar os diferentes tipos de funcionários de um
escritório que tem os seguintes cargos: gerente, assistente e vendedor. Escreva uma
classe base abstrata chamada Funcionário que declara um metodo abstrato:
double calculaSalario()

Esta classe também deve definir os seguintes atributos: nome (tipo String), código de
funcionário (tipo String) e salario base (tipo double).
Crie um construtor que recebe os
valores a serem armazenados nos respectivos atributos. Esta classe abstrata deverá ser
estendida pelas outras classes representativas dos tipos de funcionários. Em cada classe
deve-se redefinir o metodo calculaSalario() de forma que o cálculo do salário seja feito
da seguinte forma:

o gerente recebe duas vezes o salario_base, o assistente recebe o
salário_base e o vendedor recebe o salario_base mais uma comissão definida no
momento de inicialização.
Teste a sua implementação criando um objeto de cada tipo e imprima
para o ecrã os salários de cada um.
 */

package aula8.Ex1;

public class Main {
    public static void main(String[] args) {
        Funcionario[] listaFuncionarios = new Funcionario[3];

        Gerente g1 = new Gerente("diogo", "123",800);
        Assistente a1 = new Assistente("filipe", "234", 800);
        Vendedor v1 = new Vendedor("pereira", "345", 800,0);

        System.out.println("Tem " + listaFuncionarios.length +" funcionários.");
        System.out.println(g1.calculaSalario());
        System.out.println(a1.calculaSalario());
        System.out.println(v1.calculaSalario());
        v1.setVendas(11);
        System.out.println(v1.calculaSalario());

    }
}
