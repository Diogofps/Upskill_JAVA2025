package aula6.TrabalhoAutonomo3;

public class Main {

    public static void main(String[] args){
        Person Diogo = new Person("Diogo", "Soares", 31);
        System.out.println(Diogo.getFirstName());
        System.out.println(Diogo.getLastName()); // nao podemos pôr sem o get, porque a class PERSON é private.
        System.out.println(Diogo.getAge());
        Diogo.setStreet("Lisboa");
        System.out.println(Diogo.getStreet());
        Diogo.setNat("Portuguesa");
        System.out.println(Diogo.getNat());
        System.out.println(Diogo); // quando escrevemos println o java vai automaticamente procurar um string, sem ele, ele vai imprimir por omissao (metodo toString)

        //Exercicio3 retangulo = new Exercicio3 (2, 3);
    }

}