/// ● Gerente de loja: valor fixo igual ao dos empregados sem especialização, acrescido
/// de um prémio de 200€ que é atribuído sempre que a loja cumpre os objectivos
/// das vendas.

/*
package aula7.Ex1;

public class GerenteDeLoja extends Empregado {
    private String nome;
    private String ssn;

    private boolean objetivosCumpridos;
    private int premio  = 200;

    public GerenteDeLoja(String nome, String ssn, int salario) {
        super(nome, ssn);
    }

    @Override
    public int getSalario(){
        if (objetivosCumpridos)
            return super.getSalario() +premio; // aqui defino o premio de salário, caso objectivosCumpridos = true
        }
        return super.getSalario(); //return = sai da função. para caso objetivosCumpridos = false
}

}

*/