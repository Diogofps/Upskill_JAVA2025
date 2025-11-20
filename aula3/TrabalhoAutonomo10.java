/*
10. Criar uma função que peça ao utilizador três números e os coloque
por ordem crescente. Neste exercício é preciso utilizar o scanner para
pedir ao utilizador três números.*/


package aula3;
import java.util.Scanner;
public class TrabalhoAutonomo10 {

public static void main(String[] args) {
    Scanner s = new Scanner(System.in); // Cria o Scanner para ler input
    System.out.println("Dá-me o primeiro número"); // Pede ao utilizador
    int v1 = s.nextInt();
    System.out.println("Dá-me o segundo número");
    int v2 = s.nextInt();
    System.out.println("Dá-me o terceiro número");
    int v3 = s.nextInt();
    System.out.println("Os números por ordem crescente são: " + ordenar(v1,v2,v3));
}
    public static String ordenar(int v1, int v2, int v3){
    if (v1 > v2 && v1 > v3) {
        if (v2 > v3){
            return(v3 +"\n" + v2 +"\n" +v1);
        }else{
            return(v2 +"\n" + v3 +"\n" +v1);
        }
    }
    else if (v2 > v1 && v2 > v3) {
        if (v1 > v3){
            return(v3 +"\n" + v1 +"\n" +v2);
        }else{
           return(v1 +"\n" + v3 +"\n" +v2);
        }
    }
    else {
        if (v1 > v2){
            return(v2 +"\n" + v1 +"\n" +v3);
        }else{
            return(v1 +"\n" + v2 +"\n" +v3);
        }
    }
}
}
