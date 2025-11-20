package aula7.exemplo1;

public class Main {
    static void main(String[] args) {
    Trabalhador manel = new Trabalhador ("Manel", 47);
        System.out.println(manel);

    Supervisor jose = new Supervisor("José", 58, 1);
        System.out.println(jose); // print informação sobre o josé
        System.out.println(jose.getSalario()); // print apenas o salário do josé

        /*
        Supervisor maria = new Supervisor("José", 58, 1);
        System.out.println(jose); // print informação sobre o josé
        System.out.println(jose.getSalario()); // print apenas o salário do josé
         */
    }
}
