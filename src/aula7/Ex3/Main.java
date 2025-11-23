package aula7.Ex3;

public class Main {

    static void main(String[] args) {
        JogadordeCampo diogo = new JogadordeCampo("Diogo", 31, 0, 0, 0);
        GuardaRedes filipe = new GuardaRedes("Filipe", 42, 0);

        System.out.println(diogo);
        System.out.println(filipe);

        diogo.registarPassesFeitos();
        diogo.registarPassesFeitos();
        diogo.registarPassesFeitos();
        diogo.registarPassesFeitos();

        diogo.registarPassesRecebidos();
        diogo.registarPassesRecebidos();
        diogo.registarPassesRecebidos();
        diogo.registarPassesRecebidos();
        diogo.registarPassesRecebidos();

        diogo.registarGolo(filipe);
        diogo.registarGolo(filipe);

        System.out.println(diogo);
        System.out.println(filipe);
    }

}
