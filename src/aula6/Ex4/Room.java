package aula6.Ex4;

public class Room {
    public int capacidade;
    public String bloco;
    public int numSala;
    private Student[] alunos; // cria o array/vetor alunos???

//Construtor
    public Room(int capacidade, String bloco, int numSala) {
    this.capacidade=capacidade;
    this.bloco=bloco;
    this.numSala=numSala;
    alunos = new Student[capacidade];
}
//Funcoes
    public void addStudent(Student a) {
        for (int i = 0; i < capacidade; i++) { //i é a posição no array, e começa o ciclo em 0. enquanto i for menor que capacidade, adiciona 1
            if(alunos[i] == null){ //se a posição i no array alunos for null (não tem nenhum aluno, portanto está vago)...
                alunos [i] = a;// ...adiciona o aluno a
                System.out.println("Adicionei um aluno à sala.");
                break;
            }
        }
    }
    public void removeStudent(int numAluno){
        for (int i = 0; i < capacidade; i++) { // i (posição variavel) percorre o array, começando pela posição 0.
            if (alunos [i].getNumAluno() == numAluno){ // em cada posição, procura um aluno (getNumAluno) como o mesmo numero dado como argumento (numAluno)
                alunos[i] = null; // se encontrar, substitui a posição desse aluno por null (remove aluno da sala)
                break;
            }
        }
    }
    public void listarAlunos(){
        int contador = 0;
        for (int i = 0; i < capacidade; i++) {
            if (alunos[i] != null){
                contador++;
            }
        }
            if (contador >1){
                System.out.print("Existem "+ contador +" alunos na sala:\n");
            }else{
                System.out.print("Existe "+ contador +" aluno na sala:\n");
            }
        for (int i = 0; i < capacidade; i++) {
                if (alunos[i] != null){
                System.out.println(alunos[i]);
                }
        }
    }
}