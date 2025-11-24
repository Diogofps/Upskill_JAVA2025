package aula11.Ex2;

public class Main {

    static void main(String[] args) {
        FiguraGeometricaPlana f1 = new Retangulo(1,2);
        FiguraGeometricaPlana f2 = new Circulo(2, 2);
        FiguraGeometricaTridimensional f3 = new Prisma(2,2);

        System.out.println("A área de " + f1.getNomeFiguraPlana() + " é: " + f1.getArea());
        System.out.println("O perímetro de " + f2.getNomeFiguraPlana() + " é: " + f2.getPerimetro());

        System.out.println("A área de " + f3.getNomeFiguraTridimensinal() + " é: "+ f3.getAltura());
        System.out.println("O volume de " + f3.getNomeFiguraTridimensinal() + " é: "+ f3.getVolume());
    }


}
