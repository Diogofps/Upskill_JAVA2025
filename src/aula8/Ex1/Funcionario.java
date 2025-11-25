package aula8.Ex1;

public abstract class Funcionario {

    public String nome;
    public String codFuncionario;
    public double salarioBase;
    public abstract double calculaSalario();

    public Funcionario(String nome, String codFuncionario, double salarioBase) {
        this.nome = nome;
        this.codFuncionario = codFuncionario;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodFuncionario() {
        return codFuncionario;
    }
    public void setCodFuncionario(String codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", codFuncionario='" + codFuncionario + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
