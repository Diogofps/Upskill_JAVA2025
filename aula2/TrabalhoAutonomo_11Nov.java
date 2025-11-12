// demorei umas 3h a fazer isto ദ്ദി •‿• ) 11/11/2025

public static void main(String[] args) {
    //1. Obter a soma de dois números.
        int a = 1;
        int b = 2;
        int resultado = a + b;
        System.out.println("Exercício 1: O resultado é " + resultado);
    //2. Obter o quadrado de um número.
        int square = (int) Math.pow(b, 2);
        System.out.println("Exercício 2: O resultado é " + square);
    //3. Obter a diferença entre dois números.
        int diferenca = a - b;
        int diferencaAbsoluta = Math.abs(a - b);
        System.out.println("Exercício 3(v1): O resultado é " + diferenca);
        System.out.println("Exercício 3(v2): O resultado é " + diferencaAbsoluta);
        // duas formas diferentes de resolver
    //4. Obter a média entre dois números.
        double media = (a + b)/2;
        System.out.println("Exercício 4: O resultado é " + media);
    //5. Obter a área de um retângulo, dando os lados.
        int ladoMenor = 2;
        int ladoMaior = 4;
        int area = (ladoMaior * ladoMenor);
        System.out.println("Exercício 5: O resultado é " + area);
    // 6. Dada uma temperatura em Fahrenheit, obter a temperatura em Celsius.
        int tempF = 180;
        double tempC = (tempF - 32) / 1.8;
        int tempC_int = (int) Math.round(tempC); //passo extra para arredondar
        System.out.println("Exercício 6: O resultado é " + tempC_int +"ºC");
    // 7. Dada uma temperatura em Celsius, obter a temperatura em kelvin.
        double tempK = tempC + 273.15;
        int tempK_int = (int) Math.round(tempK); //passo extra para arredondar
        System.out.println("Exercício 7: O resultado é " + tempK_int +"ºK");
    // 8. Dado um comprimento em centímetros, obter o valor em polegadas.
        int cm = 10;
        double pol = cm / 2.54;
        int pol_int = (int) Math.round(pol);
        System.out.println("Exercício 8: O resultado é " + pol_int +" polegadas");
    // 9. Dado um preço, obter o IVA a 23% correspondente ao mesmo. (Ex:100€ -> 18.70€).
        int preco = 100;
        double iva = preco / 1.23;
        int iva_int = (int) Math.round(iva);
        System.out.println("Exercício 9: O IVA em 100€ é " + iva_int +" €");
    // 10. Dado um número com casas decimais (double), devolve o inteiro aproximado. (Ex: 4.3 -> 4, 5.7 -> 6)
        double num = 4.3;
        int num_int = (int) Math.round(num);
        System.out.println("Exercício 10: O resultado é " + num_int);
    // 11. Obter o perímetro de um círculo, dado o seu diâmetro.
        int diam = 3;
        double perimetro = Math.PI * diam;
        System.out.println("Exercício 11: O resultado é " + String.format("%.2f", perimetro)); //reduz a 2 casas decimais
    // 12. Obter a área de um prisma retangular, dando a sua largura, altura e comprimento.
        int l = 5;
        int alt = 3;
        int c = 8;
        int areaPrisma = 2*(l*c) + 2*(l*alt) + 2*(c*alt);
        System.out.println("Exercício 12: O resultado é " + areaPrisma);
    // 13. Criar uma função que permita arredondar um valor decimal a 2 casas decimais. (Ex: 12.3456789 -> 12.35)
        double valor = 12.345;
        double valor1 = valor *100;
        double valor2 = Math.round(valor1);
        double valor3 = valor2/100;
        System.out.println("Exercício 13: O resultado é " + valor3);

   // 14. Criar uma função que permita arredondar um valor decimal a um número X de casas decimais.
    // (Ex: 12.3456789 -> 3 casas decimais: 12.346; 1 casa decimal: 12.3; 4 casas decimais: 12.345
    
}



