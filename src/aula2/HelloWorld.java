public static void main(String[] args) {
System.out.println("Hello World!");

// Exercicio 1 MAIN
    int res = sumMult(2, 2, 2); // int = valor inteiro, res = resultado, em sumMult defini os valores de a, b, c
    System.out.println("O resultado do exercicio 1 é: " + res); // "O resultado é" - aspas definem a palavra a imprimir, + res invoca a função res (resultado)

// Exercicio 2 MAIN
    double res2 = circleArea(2);
    System.out.println("O resultado do exercicio 2 é: " + res2);

// Exercicio 3 MAIN - Crie uma função que permita converter uma temperatura em graus Celsius  para Fahrenheit
    double res3 = temp(10);
    System.out.println("O resultado do exercicio 3 é: " + res3);
}

// Exercicio 1
public static int sumMult (int a, int b, int c){
    int d = a + b;
    int e = d * c;
    return e;
}
//Exercicio 2
public static double circleArea(int r){
    return Math.PI*Math.pow(r,2);
}
//Exercicio 3
public static double temp(double tempC){
    return (tempC*1.8)+32;
}
