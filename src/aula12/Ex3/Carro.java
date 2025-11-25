package aula12.Ex3;

public class Carro {

    public String matricula;
    public String marca;
    public int ano;

    public Carro(String matricula, String marca, int ano) {
        this.matricula = matricula;
        this.marca = marca;
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }
}
