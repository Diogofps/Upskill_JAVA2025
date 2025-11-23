package aula7.Ex1;

public class GerenteDeLoja extends Empregados {

    private boolean objetivos;
    private int premio=200;

    public GerenteDeLoja(String nome, String ssn, boolean objetivos){
        super(nome, ssn);
        this.objetivos=objetivos;
    }

    @Override
    public double getSalario(){
        if (objetivos){
        return super.getSalario() + premio;
        }
        return super.getSalario();
    }
}
