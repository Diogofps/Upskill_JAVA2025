package aula6.TrabalhoAutonomo1;

//Classe
public class Musica {
    private String titulo;
    private int duracao;

//Construtor
    public Musica(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

//Get
    public String getTitulo() {
        return titulo;
    }
    public int getDuracao() {
        return duracao;
    }

//Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
