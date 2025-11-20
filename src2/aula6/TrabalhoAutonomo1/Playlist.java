package aula6.TrabalhoAutonomo1;

public class Playlist {

// vector da playlist, para organizar musicas
    private Musica[] mp3; // criei o vector

    private int capacidade;
    private int pointer; // funcao pointer serve para dizer em que posicao do vetor posso adicionar musicas

//Construtor
    public Playlist(int capacidade) {
        this.capacidade = capacidade;
        mp3 = new Musica[capacidade];
        pointer = 0;
    }

// Função p usar Pointer p saber qual a posição livre no vector
    public boolean isFull() {
        return pointer == mp3.length;
    }
    public boolean isEmpty() {
        return pointer == 0;
    }

// Funções p adicionar e remover musicas
    public void addMusic () { // void porque não retorna nada, só corre o comando
        if(isFull()) {
            System.out.println("A playlist está cheia, não podes adicionar mais músicas.");
        }
        mp3[pointer] = m;
        pointer++;
        /*funciona mais ou menos como um ciclo. Neste caso não é preciso, é mais simples, porque eu
        criei o vector vazio, então o pointer não precisa de procurar espaços vazios, ele sabe que a posição 0 está vazia*/
    }
    public void removeMusic () { // void porque não retorna nada, só corre o comando
        if(isEmpty()){
            System.out.println("A playlist está vazia, não podes remover mais músicas.");
        }

        int indiceRemovido = -1; // começo em -1 pq sei que é uma posição que n  existe, n pode ser removida (?)
        for (int i = 0 ; i<pointer ; i++){
            if(m.getTitulo() == mp3[i].getTitulo()) {
                mp3[i] = null;
                indiceRemovido = i;
                break;
            }
        }


        for (int i=0 ; i<pointer ; i++) {
            if(m.getTitulo().equals(mp3[i].getTitulo())) {
                mp3[i] = null;
                break;
            }
        }

        pointer --;
    }

}
public void lista() {
    for (int i = 0 ; i < pointer ; i++) {
    System.out.println(mp3[i]);
}
}
