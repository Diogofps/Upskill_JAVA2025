/*
6. Criar uma função que devolve o número de rodas que o veículo possui, dado esse mesmo veículo.
Assuma apenas os seguintes veículos: automóvel, moto, bicicleta, triciclo, camião, monociclo.
(Ex: getWheels(“Bicicleta”) -> 2). ----- Este deu luta... */


package aula3;
import java.util.Scanner;
public class TrabalhoAutonomo6 {

    public static void main(String[] args) {
        Scanner veiculo = new Scanner(System.in);
        System.out.println("Nomeia um veículo: ");
        String nomeVeiculo = veiculo.nextLine();
        int rodas = getWheels(nomeVeiculo);
        if (rodas == -1) {
            System.out.println("Não consigo identificar o número de rodas deste veículo.");
        } else {
            System.out.println(nomeVeiculo + " tem " + rodas + " rodas.");
        }
        veiculo.close(); // Boa prática, li online. Confirmar. Ainda não falámos em aula (?)
    }

    public static int getWheels(String veiculo) {
        switch (veiculo) {
            case "carro":
            case "camião":
                return 4;
            case "triciclo":
                return 3;
            case "moto":
            case "bicicleta":
                return 2;
            case "monociclo":
                return 1;
            default:
                return -1;
        }
    }
}