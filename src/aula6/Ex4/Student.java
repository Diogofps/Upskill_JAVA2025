package aula6.Ex4;
//Classe
public class Student {
    public int numAluno;
    public String nome;
    public String curso;

public Student (int numAluno, String nome, String curso) {
    this.numAluno=numAluno;
    this.nome=nome;
    this.curso=curso;
    }
//Get
    public int getNumAluno() {
        return numAluno;
    }
    public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }
//Set
    public void setCurso() {
            this.curso=curso;
    }

@Override
    public String toString(){
        return "Número de aluno: " + numAluno + "; Nome do aluno: " + nome + "; Curso: " + curso;
    }

}
