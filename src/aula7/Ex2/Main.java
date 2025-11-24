/*
Crie uma classe chamada Ingresso que possui um valor em Euros e um metodo
imprimeValor().
● Crie uma classe VIP, que herda de Ingresso e possui um valor adicional. Crie um
metodo que retorne o valor do ingresso VIP (com o adicional incluído).
● Crie uma classe CamaroteInferior (que possui a localização do ingresso e
métodos para obter e imprimir esta localização) e uma classe
CamaroteSuperior, que é mais cara (possui valor adicional). Esta última possui
um metodo para retornar o valor do ingresso. Ambos os camarotes devem
herdar as características dos Ingressos VIP.
*/

package aula7.Ex2;

public class Main {
    static void main(String[] args) {

        Ingresso i1 = new Ingresso(20);
        VIP v1 = new VIP(20);
        CamaroteInferior c1 = new CamaroteInferior(20,"lugar A24");
        CamaroteSuperior c2 = new CamaroteSuperior(20);


        System.out.println("O preço do ingresso é " + i1.getValor() +"€");
        System.out.println("O preço do ingresso VIP é " + v1.getValor()+"€");
        System.out.println("O preço do ingresso Camarote Inferior é " + c1.getValor()+"€. "+
                "Fica em: " + c1.getLocalizacao());
        System.out.println("O preço do ingresso Camarote Superior é " + c2.getValor() +"€.");
    }
}
