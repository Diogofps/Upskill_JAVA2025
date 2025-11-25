package aula12.Ex2;

import java.util.PriorityQueue;

public class Teste {
    public static void main(String[] args) {

// PriorityQueue<Senha> – Guarda os elementos por ordem de prioridade.
// Necessário classe Senha ser comparável ou passar um comparador ao construtor da PriorityQueue<>
    PriorityQueue<Senha> listaPrioritariaSenhas = new PriorityQueue<>();

    Senha s1 = new Senha(1,"Diogo", 123);
    Senha s2 = new Senha(2, "Filipe", 456);
    Senha s3 = new Senha(3, "Pereira", 789);
    Senha s4 = new Senha(3, "Soares", 963);

    listaPrioritariaSenhas.add(s3); // add(element) – adiciona elemento à fila
    listaPrioritariaSenhas.add(s2);
    listaPrioritariaSenhas.add(s4);
    listaPrioritariaSenhas.add(s1);

    System.out.println(listaPrioritariaSenhas.peek()); // peek() – mostra o 1º lugar da fila

    Senha selecionado = listaPrioritariaSenhas.poll(); // poll() – remove e devolve o elemento no topo da fila (? explicar melhor)
    System.out.println(listaPrioritariaSenhas.poll());







}
}
