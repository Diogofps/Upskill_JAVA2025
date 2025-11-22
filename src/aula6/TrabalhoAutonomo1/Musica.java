package aula6.TrabalhoAutonomo1;

public class Musica {
    private String titulo;

    public Musica(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo; // ou outros atributos
    }

}
