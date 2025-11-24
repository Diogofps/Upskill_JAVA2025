package aula11.Ex4;

public class Livro implements Comparable<Livro> {
    public String nome;
    public int ano;
    public String editora;
    public String autor;

    public Livro(String nome, int ano, String editora, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
    }
//Get
    public String getNome() {
        return nome;
    }
    public int getAno() {
        return ano;
    }
    public String getEditora() {
        return editora;
    }
    public String getAutor() {
        return autor;
    }

    @Override
    public int compareTo(Livro o) {
        return 0;
    }
}
