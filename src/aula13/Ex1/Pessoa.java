package aula13.Ex1;

public class Pessoa {
    private String nome;
    private int age;
    private String cidade;

    public Pessoa(String nome, int age, String cidade) {
        this.nome = nome;
        this.age = age;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Nome = " + nome +
                ", idade = " + age +
                ", cidade = " + cidade;
    }
}
