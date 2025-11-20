/*
Crie um programa que use um vetor de empregados para calcular o total dos salários a
pagar de uma cadeia de lojas. O vetor de empregados deve conter empregados (sem
especialização), gerentes de loja e diretores regionais.
Para cada classe de empregados, o salário é calculado da seguinte maneira:
    ● Empregados: valor fixo de 800€;
    ● Gerente de loja: valor fixo igual ao dos empregados sem especialização, acrescido
    de um prémio de 200€ que é atribuído sempre que a loja cumpre os objectivos
    das vendas.
    ● Diretor regional: valor fixo igual ao dobro do dos empregados sem especialização,
      acrescido de um prémio que corresponde a 1% do lucro mensal nas lojas da região.
Nota: para simplificar, considere que ter cumprido ou não os objectivos de vendas é um
atributo dos gerentes e que o lucro mensal da região é um atributo dos diretores.


package aula7.Ex1;

public class Main {

    Empregado[] emp = new Empregado[5]; //vector que define que existem 5 empregados
    emp[0] = new Empregado()

   int soma = 0;

    //for(int i=0; i<5; i++)
    //emp[i].getSalario // é igual à linha de baixo
    for(Empregado e : emp){
        soma = e.getSalario();
    }
    System.out.println(soma);
}

*/
