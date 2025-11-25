/*
Crie um tipo de objeto Contacto que guarda as seguintes
informações:
○ Nome
○ Número de telefone
○ Email
●●
Crie uma classe de teste e na função main() crie uma lista
(ArrayList<>) de Contactos. Experimente a inserção, remoção e
obtenção de um contacto.
●●
Percorra toda a lista de contactos e imprima para o ecrã as seguintes
informações:
João Silva - 9100000000 - joao.silva@gmail.com
Pedro Fernandes - 9100000001 - pedro.fernandes@gmail.com
Maria Rita - 9100000002 - maria.ritinha@gmail.com
 */

package aula12.Ex1;

public class Contacto {
    private String nome;
    private String tlf;
    private String email;

    public Contacto(String nome, String tlf, String email) {
        this.nome = nome;
        this.tlf = tlf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CONTACTO // " +
                "Nome: " + nome +
                ", Tlf: " + tlf +
                ", Email: " + email;
    }
}
