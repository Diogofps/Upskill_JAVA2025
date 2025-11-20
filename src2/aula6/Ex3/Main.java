/*
Desenvolva uma classe para representar retângulos, tendo em conta a sua
largura e comprimento. Os objetos retângulo deverão ser imutáveis, isto é,
uma vez criado as suas dimensões não podem ser alteradas.
○ Implemente o construtor e métodos que permitem obter o
comprimento e a largura do retângulo
○ Defina um metodo construtor adicional que cria um quadrado.
○ Defina as funções que permitem obter as seguintes informações:
■ área
■ perímetro
■ comprimento da diagonal
■ se o retângulo é um quadrado


package aula6.Ex3;

public class Main {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2,3);
        Rectangulo r2 = new Rectangulo(2,4);

        System.out.println(r1.area());
        System.out.println(r2.diagonal());
        System.out.println(r1.perimetro());
        Rectangulo r3 = new Rectangulo(2);
        System.out.println(r3.area());
    }
}*/