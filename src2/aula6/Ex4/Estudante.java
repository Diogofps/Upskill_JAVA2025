public class Estudante {

    private String nome;
    private int numeroAluno;
    private String curso;

    public Estudante (String nome, int numeroAluno){
        this.nome=nome;
        this.numeroAluno=numeroAluno;
    }

    public String getNome(){
        return nome;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }

    public String getCurso(){
        return curso;
    }

    @Override
    public String toString() {
        return "O nome do aluno é: " + nome + " e o " +
                "numero é: " + numeroAluno + " e curso é: "
                + curso;
    }
}