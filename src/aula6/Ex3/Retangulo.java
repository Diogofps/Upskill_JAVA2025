package aula6.Ex3;

public class Retangulo {

    private int comprimento;
    private int largura;

//Construtor
    // para criar retangulos
    public Retangulo (int comprimento, int largura){
        this.comprimento=comprimento;
        this.largura=largura;
    }

    public Retangulo (int lado){
        this.comprimento=lado;
        this.largura=lado;
    }
//Get
    public int getComprimento(){
        return comprimento;
    }
    public int getLargura(){
        return largura;
    }

//Funções
    public int area (){
        return comprimento*largura;
    }
    public int perimetro (){
        return 2*(comprimento+largura);
    }
    public double diagonal (){
        //double soma = Math.pow(largura) + Math.pow(comprimento);
        return Math.sqrt(comprimento*comprimento + largura*largura);
    }
    public boolean IsQuadrado (){
        //return largura==comprimento;     seria igual ao IF
        if(comprimento==largura){
            return true;
        }else{
            return false;
        }
    }

}
