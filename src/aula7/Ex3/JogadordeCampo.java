package aula7.Ex3;

public class JogadordeCampo extends Jogador {

    private int passesFeitos;
    private int passesRecebidos;

    public JogadordeCampo (String nome, int numeroJogador, int numeroGolos, int passesFeitos, int passesRecebidos){
        super(nome, numeroJogador, numeroGolos);
        this.passesFeitos=0;
        this.passesRecebidos=0;
    }

    public void registarPassesFeitos(){
        passesFeitos++;
    }

    public void registarPassesRecebidos(){
        passesRecebidos++;
    }

    public int getPassesFeitos() {
        return passesFeitos;
    }

    public int getPassesRecebidos() {
        return passesRecebidos;
    }

    @Override
    public String toString() {
        return "Jogador de campo: " + nome + " #" + numeroJogador + ", golos marcados = " + numeroGolos +
                ", passes feitos = " + passesFeitos + ", passes recebidos = " + passesRecebidos;
    }
}