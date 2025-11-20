//Escreva os números pares de 1 a 20, usando as três estruturas de ciclos apresentadas:
//while, do while, for

package aula4;
public class Ex1 {
public static void main(String[] args) {
    System.out.println("while");
        int a = 1;
        while (a <= 20){
            if (a%2 == 0){
                System.out.println(a);
            }
            a++;
        }

    System.out.println("do-while");
        int b = 1;
        do{
            if(b%2 == 0){
                System.out.println(b);
            }
            b++;
        } while(b <= 20);

    System.out.println("for");
        for(int c = 1; c<=20; c++){
            if(c%2 == 0){
                System.out.println(c);
            }
        }
}
}