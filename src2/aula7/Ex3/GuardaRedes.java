package aula7.Ex3;
/*A classe GuardaRedes, uma extensão de Jogador,
deve permitir registar e consultar o número de golos sofridos.*/

public class GuardaRedes extends Jogador {
   /* private String nome;
    private int numero;
    private int golosSofridos;
    Não precisa desta parte porque fiz extends do Jogador
    */
private int golosSofridos;
    //Construtor
    public GuardaRedes(String nome, int numero, int golosMarcados, int golosSofridos){
    super(nome,numero,golosMarcados);
    this.golosSofridos=golosSofridos;
    }

//Gets
    public int getGolosSofridos(){
        return golosSofridos;
    }
    public void sofreGolo(){
        golosSofridos++;
    }

    @Override
    public String toString() {
        return "Jogador: " + nome
                + ", numero: " + numero
                + ", golos marcados: " + getGolosMarcados()
                + ", golos sofridos: " + getGolosSofridos();
        }
}