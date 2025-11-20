package aula4;

public class ExemploVetores {
    static void main(String[] args) {
        int[] v = new int[3];
        v[0] = 127;
        v[1] = -33;
        v[2] = 70;

        int soma = 0;
        for(int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
        System.out.println("Soma: " + soma);

        //contagem de numeros pares:
        int[] v2 = {12,15,33,54,128,2};
        v2[5] = 17;
        int count = 0;
        for(int j = 0; j < v2.length; j++) {
            if (v2[j] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Número de pares: " + count);

        int[] v3 = {12, 33, 44, 90, 12, 17, -3, 21};
        int maximo = obterMaximo(v3);
        System.out.println("Valor maior: " + maximo); //90
    }

    public static int obterMaximo(int[] v) {
        int max = v[0];
        for(int i = 1; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }
}