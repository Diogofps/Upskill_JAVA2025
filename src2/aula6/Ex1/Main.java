package aula6.Ex1;
/*
Ex1: Implemente a classe Person:
● Atributos: primeiro nome, último nome, idade, morada, nacionalidade
● Defina getters e setters para todos os atributos
● O construtor deve receber o primeiro nome, o último nome e a idade
Crie um teste de forma a validar que a implementação funciona.
*/

//Main
public class Main {
    public static void main(String[] args) {
        Person joao = new Person("Joao", "Silva", 20);
        System.out.println(joao.getFirstName());
        System.out.println(joao.getLastName());

        joao.setLastName("Santos");
        System.out.println(joao.getLastName());

        System.out.println(joao.getStreet()); // dá null porque não tinha definido Street
        joao.setStreet("Lisboa"); // aqui defini Street
        System.out.println(joao.getStreet()); // voltei a pedir, para confirmar que tinha guardado Street
        System.out.println(joao); // devolve todas as informações de "joao" no construtor
    }
}