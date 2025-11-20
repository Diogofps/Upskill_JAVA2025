public class Sala {
    private int capacidade;
    private String bloco;
    private int numeroSala;
    private Estudante[] alunos;

    public Sala(int capacidade, String bloco, int numeroSala){
        this.capacidade=capacidade;
        this.bloco=bloco;
        this.numeroSala=numeroSala;
        alunos = new Estudante[capacidade];
    }

    public void listarAlunos(){
        for(int i =0; i<capacidade;i++){
            Estudante a = alunos[i];
            System.out.println(a);
        }
    }

    public void entrar(Estudante e){
        for(int i =0; i<capacidade;i++){
            if(alunos[i] == null){
                alunos[i] = e;
                break;
            }
        }
    }

    public  void sair(int numeroAluno){
        for(int i =0; i<capacidade;i++){
            if(alunos[i] !=null) {
                if (alunos[i].getNumeroAluno() == numeroAluno) {
                    alunos[i] = null;
                }
            }
        }
    }
}
