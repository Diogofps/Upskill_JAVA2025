package aula7.exemplo1;

public class Trabalhador {
    private String nome;
    private int idade;
    private final double salario = 600; // o final impede-nos de alterar o valor do salario

//Construtor
public Trabalhador (String nome, int idade){
    this.nome=nome;
    this.idade=idade; // estudar para que serve
}

//Gets
public String getNome(){
    return nome;
}
public int getIdade(){
    return idade;
}
public double getSalario(){
    return salario;
}

@Override //estudar
public String toString(){ //estudar
    return "Trabalhador{" +
            "nome= " + nome +
            ", idade =" + idade +
            ", salario =" + salario +
            '}';
}
}
