package aula6.Ex1e2;

public class Main {

        public static void main(String[] args){
            Person iara = new Person("Diogo", "Soares", 31);
            System.out.println(iara.getFirstName());
            System.out.println(iara.getLastName()); // nao podemos pôr sem o get, porque a class PERSON é private.
            System.out.println(iara.getAge());
            iara.setAddress("Lisboa");
            System.out.println(iara.getAddress());
            iara.setNat("Portuguesa");
            System.out.println(iara.getNat());
            System.out.println(iara); // quando escrevemos println o java vai automaticamente procurar um string, sem ele, ele vai imprimir por omissao (metodo toString)

        }

}

