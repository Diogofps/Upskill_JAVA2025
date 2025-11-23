package aula7.Ex3;

public class GuardaRedes extends Jogador {

  private int golosSofridos;

    public GuardaRedes (String nome, int numeroJogador, int golosSofridos){
        super(nome, numeroJogador, golosSofridos);
        this.golosSofridos=golosSofridos;
    }

    public int getGolosSofridos() {
        return golosSofridos;
    }
    public void registarGoloSofrido(){
        golosSofridos++;
    }


    @Override
    public String toString() {
        return "Guarda-Redes: " + nome + " #" + numeroJogador +
                ", golos sofridos = " + golosSofridos;
    }
}


