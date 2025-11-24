package aula11.Ex2;

public class Prisma implements FiguraGeometricaTridimensional{
    public int altura;
    public int volume;

    public Prisma (int altura, int volume){
        this.altura=altura;
        this.volume=volume;
    }

    @Override
    public String getNomeFiguraTridimensinal() {
        return "Prisma";
    }

    @Override
    public int getAltura() {
        return altura;
    }
    @Override
    public int getVolume() {
        return volume;
    }
}
