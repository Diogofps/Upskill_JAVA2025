package aula6.TrabalhoAutonomo1;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(3);
        Musica m0 = new Musica("Musica 1");
        Musica m1 = new Musica("Musica 2");
        Musica m2 = new Musica("Musica 3");

        playlist.addMusic(m0);
        playlist.addMusic(m1);
        playlist.addMusic(m2);

       playlist.lista(); // Mostra todas as músicas adicionadas

        playlist.removeMusic(m2); // Remove uma música
        playlist.lista(); // Mostra as restantes;

        System.out.println("Capacidade da playlist: " + playlist.getCapacidade());
    }

}
