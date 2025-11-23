package aula6.Ex3;

public class Main {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(2,3);
        System.out.println("A área é: " + r1.area());
        System.out.println("A diagonal é: " + r1.diagonal());
        System.out.println("O perimetro é: " + r1.perimetro());

        Retangulo r3= new Retangulo(10);
        System.out.println("A área do quadrado é: " + r3.area());

        Retangulo r4 = new Retangulo(3,4);
        System.out.println("Função isQuadrado: " + r4.IsQuadrado());

        Retangulo r5 = new Retangulo(6,6);
        System.out.println("Função isQuadrado: " + r5.IsQuadrado());
    }
}
