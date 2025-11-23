package aula6.Ex4;

public class Main {
    public static void main(String[] args) {
        Student a = new Student(123,"Diogo","Java"); //cria um aluno
        Student b = new Student(456, "Filipe", "Design"); //cria um aluno

        System.out.println("Nome do aluno a: " + a.getNome());

        Room sala1 = new Room(3,"A",1); //cria uma sala
        sala1.addStudent(a); //adiciona aluno "a" à sala
        sala1.listarAlunos(); // imprime lista dos alunos
        sala1.addStudent(b); //adiciona aluno "a" à sala
        sala1.listarAlunos(); // imprime lista dos alunos

    }


}
