package aula11.Ex3;

public class Filme implements Comparable<Filme>{
    public int pontuacao;
    public String nome;
    public int ano;

public Filme(int pontuacao, String nome, int ano){
    this.pontuacao=pontuacao;
    this.nome=nome;
    this.ano=ano;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    @Override
        public int compareTo(Filme a) {
    if(ano == a.getAno()){
        return (int) (pontuacao -a.getPontuacao());
    }
        return ano - a.getAno();
    }
}
