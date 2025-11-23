package aula7.Ex3;

public class Jogador {

    public String nome;
    public int numeroJogador;
    public int numeroGolos;

    public Jogador(String nome, int numeroJogador, int numeroGolos){
        this.nome=nome;
        this.numeroJogador=numeroJogador;
        this.numeroGolos=numeroGolos;
    }

    public int getNumeroGolos() {
        return numeroGolos;
    }

    public void registarGolo(GuardaRedes gr){
        System.out.println("Golo do " + nome +"!");
        numeroGolos++;
        gr.registarGoloSofrido();
    }

    @Override
    public String toString() {
        return "Jogador" + nome + " (#" + numeroJogador + "), golos marcados= " + numeroGolos;
    }
}
