package aula6.Ex3;

// Atributos do retângulo
public class Rectangulo {
    private int largura;
    private int comprimento;

// Construtor
    public Rectangulo (int largura, int comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

// Métodos
// Gets
    public int getLargura(){
        return largura;
    }
    public int getComprimento(){
        return comprimento;
    }

//Funções
    public int area(){
        return comprimento*largura;
    }
    public int perimetro(){
        return (comprimento*2) + (largura*2);
    }
    public double diagonal(){
        double soma = Math.pow(largura,2) + Math.pow(comprimento,2);
        return Math.sqrt(soma);
    }
}
