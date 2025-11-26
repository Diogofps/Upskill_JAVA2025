package aula8.Ex2;

public class Main {

    static void main(String[] args) {

        CalculadoraCientifica calc = new CalculadoraCientifica();
        double c1 = calc.soma(1,1);
        double c2 = calc.subtracao(1,1);
        double c3 = calc.divisao(1,1);
        double c4 = calc.multiplicacao(2,2);
        double cc1 = calc.raizQuad(2);
        double cc2 = calc.potencia(2,2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(cc1);
        System.out.println(cc2);


    }

}
