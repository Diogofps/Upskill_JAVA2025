package aula7.Ex1;

public class Main {

   static void main(String[] args) {

        Empregados[] emp = new Empregados[4];

        emp[0]= new Empregados("Maria","5389");
        emp[1]= new GerenteDeLoja("Joana", "7979", false);
        emp[2]= new DiretorRegional("Carlos", "1079", 1000);
        emp[3]= new DiretorRegional("Filipe", "4523", 13);

       System.out.println("Lista de salários: ");
        double soma = 0; //define que soma = 0, antes do ciclo começar
        for (Empregados e : emp) {
            System.out.println(e.getSalario() +" €");
            soma = soma + e.getSalario(); //a cada ciclo, adiciona o valor do salário a "soma"
        }
       System.out.println("Valor total dos salários: " + soma + "€");
    }
   }

