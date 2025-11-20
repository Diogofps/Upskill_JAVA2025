// Exercício 2:
public class Ex2 {
    public static void getTemperature(int temp) {
        if (temp < 0) {
            System.out.println("Está gelado!");
        }
        if (temp >= 0 && temp < 15) {
            System.out.println("Está frio");
        }
        if (temp > 50 && temp < 80) {
            System.out.println("Está quente");
        }
        if (temp >= 80) {
            System.out.println("Está a ferver!");
        }
        if (temp >= 15 && temp <= 50) {
            System.out.println("Está normal");
        }
    }

//V2, simplificado usando o return. Faz com que não seja necessário o else
public static void getTemperatureAlternativa(int temp) {
        if (temp < 0) {
            System.out.println("Está gelado!");
            return;
        }
        if (temp < 15) {
            System.out.println("Está frio");
            return;
        }
        if (temp >= 80) {
            System.out.println("Está a ferver!");
            return;
        }
        if (temp > 50) {
            System.out.println("Está quente");
            return;
        }

        System.out.println("Está normal");
    }

    static void main(String[] args) {
        getTemperature(-3);
        getTemperature(6);
        getTemperature(17);
        getTemperature(35);
        getTemperature(60);
        getTemperature(120);
    }
}