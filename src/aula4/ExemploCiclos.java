// Escreva os números pares de 1 a 20, usando as três estruturas de ciclos apresentadas
package aula4;

public class ExemploCiclos {
    static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            System.out.println("O i agora é " + i);
            i++; //i = i + 1;
        }

        System.out.println("Começou.");
        int j = 0;
        while (j < 1000000000) {
            j++;
        }
        System.out.println("Acabou. " + j);

        int k = 0;
        int soma = 0;
        while(k < 10) {
            soma += k; //igual: soma = soma + k;
            k++; //igual: k = k + 1;
        }
        System.out.println("O valor da soma é " + soma);

        int soma2 = 0;
        for (int l = 0; l < 10; l++) {
            soma2 += l;
        }
        System.out.println("O valor da soma2 é " + soma2);


        int a = 0;
        while (a < 10) {
            System.out.println("O a agora é " + a);
            a++;
        }
        System.out.println("Só agora é que cheguei ao fim");


        int soma3 = 0;
        int m = 0;
        while (m < 20) {
            soma3 += m;
            m++;
            if (soma3 >= 100) {
                break;
            }
        }
        System.out.println("Soma3: " + soma3 + " m: " + m);
    }
}
