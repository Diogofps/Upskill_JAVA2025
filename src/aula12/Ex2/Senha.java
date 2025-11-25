/*Pretende-se representar um gestor de senhas numa repartição de Finanças.
●●
Crie um objeto do tipo Senha que guarda as seguintes informações:
○ Nº de Senha
○ Nome de utilizador
○ NIF
●●
Crie uma classe de teste e na função main() crie uma fila prioritária
(PriorityQueue<>), adicione várias senhas. Implemente o comparador na classe
senha, de modo às senhas serem ordenadas pelo número de senha. Confirme
que a fila prioritária devolve as senhas pela ordem correcta
● Dica: utilize os métodos peek() e poll() */

package aula12.Ex2;

public class Senha implements Comparable<Senha>{
    private int numSenha;
    private String user;
    private int nif;

    public Senha(int numSenha, String user, int nif) {
        this.numSenha=numSenha;
        this.user=user;
        this.nif=nif;

    }

    public int getNumSenha() {
        return numSenha;
    }

    public void setNumSenha(int numSenha) {
        this.numSenha = numSenha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public int compareTo(Senha o) {
        return this.getNumSenha()-o.getNumSenha();

    }

    @Override
    public String toString() {
        return "Senha{" +
                "numSenha=" + numSenha +
                ", user='" + user + '\'' +
                ", nif=" + nif +
                '}';
    }


}
