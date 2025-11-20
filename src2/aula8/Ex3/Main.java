package aula8.Ex3;

import aula8.Ex1.Gerente;

public class Main {
        public static void main(String[] args) { //metodo
            CartaoPresente[] mensagem = new CartaoPresente[3];
            mensagem[0] = new DiaDosNamorados("Diogo");
            mensagem[0].showMessage(); // para testar
            mensagem[1] = new Natal("Diogo");
            mensagem[1].showMessage(); // para testar
            mensagem[2] = new Aniversario("Diogo");
            mensagem[2].showMessage(); // para testar
        }

}
