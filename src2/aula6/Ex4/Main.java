/*
Crie um sistema de gestão de alunos numa sala. Para tal, deverá criar as
classes Room e Student. Cada sala tem a sua capacidade, o nome do bloco
(ex: A, B, C, D) e o número da sala. Cada aluno terá o número de aluno, o
nome e o curso. Deve ser possível realizar as seguintes operações:
● adicionar alunos a uma sala (até ao limite da sua capacidade)
● remover um aluno específico, com base no seu número
● listar todos os alunos que estão na sala
 */

public class Main {

    public static void main(String args[]){
        Estudante a = new Estudante("João", 1);
        Estudante b = new Estudante("Mário", 2);
        Estudante c = new Estudante("Maria", 3);
        Estudante d = new Estudante("Catarina", 4);


        System.out.println(a.getNumeroAluno());
        System.out.println(a.getNome());

        Sala principal = new Sala(3, "A", 45);
        principal.listarAlunos();
        principal.entrar(a);

        System.out.println();
        principal.listarAlunos();

        principal.entrar(b);
        System.out.println();
        principal.listarAlunos();

        System.out.println();
        principal.sair(1);
        principal.listarAlunos();

    }
}
