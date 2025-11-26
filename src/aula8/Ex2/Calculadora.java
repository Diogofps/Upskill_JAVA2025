/// Crie uma classe Calculadora. Esta classe deve ser abstrata e implementar as operações
/// básicas (soma, subtração, divisão e multiplicação).
/// Utilizando o conceito de herança, crie uma classe chamada CalculadoraCientífica que
/// implementa os seguintes cálculos: raiz quadrada e a potência.
/// Dica: utilize a classe Math do pacote java.lang.

package aula8.Ex2;

public abstract class Calculadora {
    public double soma;
    public double subtracao;
    public double divisao;
    public double multiplicacao;

   public double soma(double a, double b){
       return a+b;
    }

    public double subtracao(double a, double b){
       return a-b;
    }

    public double divisao(double a, double b){
       return a/b;
    }

    public double multiplicacao(double a, double b){
       return a*b;
    }

    public double getSoma() {
        return soma;
    }
}
