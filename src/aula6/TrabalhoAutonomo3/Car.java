package aula6.TrabalhoAutonomo3;

//Casse
public class Car {
    private String marca;
    private String modelo;
    private int consumo;
    private String matricula;
    private int capAtual;
    private int capMaxima;
    private boolean ligado;

//Construtor
    public Car(String marca,String modelo,int consumo,String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.matricula = matricula;
        this.capAtual = capAtual;
        this.capMaxima = capMaxima;
    }
//Funções
    void encherDeposito(int litro) {
        int total = this.capAtual+litro;

        if (total >= capMaxima){
            this.capAtual = this.capMaxima;
        }else{
            this.capAtual=total;
        }
    }
    void run (){
        int custoKM = this.consumo/100;
        this.setCapAtual (this.capAtual-custoKM);
    }
    boolean isLigado(){
        return this.ligado;
    }
    void setLigado(boolean ligado){
        this.ligado = ligado;
    }

//Gets
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getConsumo() {
        return consumo;
    }
    public String getMatricula() {
        return matricula;
    }
    public int getCapAtual() {
        return capAtual;
    }
    public int getCapMaxima() {
        return capMaxima;
    }
//Sets
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    public void setCapAtual(int capAtual) {
        this.capAtual = capAtual;
    }
}

