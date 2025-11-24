package aula11.Ex1;
public enum OperacoesMatematicas {
    SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO;

    public int efetuaOperacao(int a,int b) {
        switch(this){
            case SOMA:
                return a+b;
            case SUBTRACAO:
                return a-b;
            case MULTIPLICACAO:
                return a*b;
            case DIVISAO:
                return a/b;
        }
        return 0;
    }
}