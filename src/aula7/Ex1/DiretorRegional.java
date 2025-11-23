package aula7.Ex1;

public class DiretorRegional extends Empregados {

    private int lucroMensal;

    public DiretorRegional(String nome, String ssn, int lucroMensal){
        super(nome, ssn);
        this.lucroMensal=lucroMensal;
    }

    @Override
    public double getSalario(){
        return super.getSalario()*2 + lucroMensal * 0.01;
    }
}
