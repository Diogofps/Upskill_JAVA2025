package aula7.Ex3;
//deve permitir registar e consultar o numero de passes feitos e recebidos

public class JogadorDeCampo extends Jogador {
    private int passesFeitos;
    private int passesRecebidos;

//Construtor
    public JogadorDeCampo(String nome, int numero, int golosMarcados, int passesFeitos, int passesRecebidos) {
        super(nome, numero, golosMarcados);
        this.passesFeitos = passesFeitos;
        this.passesRecebidos = passesRecebidos;
    }

@Override
public String toString() {
    return "Jogador: " + nome +
            ", numero: " + numero +
            ", golos marcados: " + golosMarcados +
            ", passes feitos: " + passesFeitos +
            ", passes recebidos: " + passesRecebidos;
}
}
