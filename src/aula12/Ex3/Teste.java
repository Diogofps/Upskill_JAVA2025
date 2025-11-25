package aula12.Ex3;

import java.util.HashMap;
import java.util.Map;

public class Teste {




    static void main(String[] args) {

    Map<String,Carro> mapaCarros = new HashMap<>();

        Carro c1 = new Carro("11-AA-11", "BMW",1999);
        Carro c2 = new Carro("22-BB-22", "Opel",2000);
        Carro c3 = new Carro("33-CC-33", "Vauxhall",2025);

        mapaCarros.put(c1.getMatricula(), c1);
        mapaCarros.put(c2.getMatricula(), c2);
        mapaCarros.put(c3.getMatricula(), c3);
        System.out.println(mapaCarros.keySet());

        mapaCarros.remove(c3.getMatricula(), c3);
        System.out.println(mapaCarros.keySet());
    }

}
