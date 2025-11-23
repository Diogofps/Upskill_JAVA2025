package aula7.Ex1;

public class Empregados {

    private String nome;
    private String ssn;
    private double salario = 600;

    public Empregados(String nome, String ssn){
        this.nome=nome;
        this.ssn=ssn;
    }

    public String getNome() {
        return nome;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalario() {
        return salario;
    }


}
