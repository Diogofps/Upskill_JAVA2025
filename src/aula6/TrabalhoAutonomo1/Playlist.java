package aula6.TrabalhoAutonomo1;

import aula6.TrabalhoAutonomo1.Musica;
public class Playlist {
    private int capacidade;
    private int pointer; // funcao pointer serve para dizer em que posicao do vetor posso adicionar musicas

// vector da playlist, para organizar musicas
    private Musica[] mp3; // criei o vector

//Construtor
    public Playlist(int capacidade) {
        this.capacidade = capacidade;
        mp3 = new Musica[capacidade];
        pointer = 0;
    }
//Gets
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
//Funções
    // Função p usar Pointer p saber qual a posição livre no vetor
    public boolean isFull() {
        return pointer == mp3.length;
    }
    public boolean isEmpty() {
        return pointer == 0;
    }
    // Função p adicionar e remover músicas
    public void addMusic (Musica m) { // void porque não retorna nada, só corre o comando
        if(isFull()) {
            System.out.println("A playlist está cheia, não podes adicionar mais músicas.");
        }
        mp3[pointer] = m;
        pointer++;
        // funciona mais ou menos como um ciclo. Neste caso não é preciso, é mais simples, porque eu
        // criei o vector vazio, então o pointer não precisa de procurar espaços vazios, ele sabe que a posição 0 está vazia
    }
    public void removeMusic (Musica m) { // void porque não retorna nada, só corre o comando
        if(isEmpty()){
            System.out.println("A playlist está vazia, não podes remover mais músicas.");
        return;
        }

        int indiceRemovido = -1; // encontra e elimina a musica do vetor. Começo em -1 pq sei que é uma posição que n existe, n pode ser removida (?)
        for (int i = 0 ; i<pointer ; i++){
            if(m.getTitulo().equals(mp3[i].getTitulo())) {
                mp3[i] = null;
                indiceRemovido = i;
                break;
            }
        }

        if (indiceRemovido != -1) { // ao remover musicas, move o pointer para trás, para não deixar espaços vazios a meio do vetor
        for (int i= indiceRemovido ; i<pointer-1 ; i++) {
            mp3[i] = mp3[i + 1];
            }
            mp3[pointer -1] = null;
            pointer--;
            }


    }
    // Função p listar musicas da playlist
    public void lista() {
        System.out.println("Músicas na playlist: ");
        for (int i = 0 ; i < pointer ; i++) {
            System.out.println(mp3[i]);
        }
        }
}

