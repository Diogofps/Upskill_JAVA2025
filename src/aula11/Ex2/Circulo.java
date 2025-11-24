package aula11.Ex2;

public class Circulo implements FiguraGeometricaPlana, FiguraGeometricaTridimensional{

    public int raio;
    public int altura;

    public Circulo(int raio,int altura){
        this.raio=raio;
        this.altura=altura;
    }
    @Override
    public String getNomeFiguraPlana(){
        return "Círculo";
    }
    @Override
    public int getPerimetro(){
        int perimetro = (int) (2*Math.PI*raio);
        return perimetro;
    }
    @Override
    public int getArea(){
        int area = (int) (Math.PI*Math.pow(raio,2));
        return area;
    }

    @Override
    public String getNomeFiguraTridimensinal() {
        return "";
    }

    public int getAltura(){
        return altura;
    }
    public int getVolume(){
        int volume = getArea()*altura;
        return volume;
    }

}
