package aula11.Ex2;
public class Retangulo implements FiguraGeometricaPlana {
    public int comprimento;
    public int largura;

    public Retangulo(int comprimento,int largura){
        this.comprimento=comprimento;
        this.largura=largura;
    }

    @Override
    public int getPerimetro(){
        int perimetro = (comprimento*2)+(largura*2);
        return perimetro;
    }

    @Override
    public int getArea() {
        int area = comprimento*largura;
        return area;
    }

    @Override
    public String getNomeFiguraPlana(){
        return "Retângulo";
    }
}