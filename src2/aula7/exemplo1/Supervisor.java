package aula7.exemplo1;

    public class Supervisor extends Trabalhador{

        private int lugarEstacionamento;

        public Supervisor (String nome, int idade, int lugarEstacionamento){
            super (nome, idade); // invoca o construtor, faz o quê mesmo?
            this.lugarEstacionamento = lugarEstacionamento ;
        }

    @Override
        public double getSalario(){
            return super.getSalario()*2; //super vai buscar metodo da superclasse, neste caso, Trabalhador
        // se não usasse o super, ele procuraria o getSalario na classe Supervisor, onde não existe
    }

    @Override
        public String toString(){
            return "Supervisor - O meu nome é " + getNome() +
                    ", tenho " + super.getIdade() +
                    " e o meu salário é " + getSalario() +
                    ", mas o salário original é " + super.getSalario();
    }
}
