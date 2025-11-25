package aula12.Ex1;
import java.util.ArrayList;
import java.util.List;
public class Teste {

    public static void main(String[] args) {
        List<Contacto> listaContactos = new ArrayList<>();
        Contacto c1 = new Contacto ("João Silva", "910000000","joao.silva@gmail.com");
        listaContactos.add(c1);
        listaContactos.add(new Contacto("Pedro Fernandes", "9100000001", "pedro.fernandes@gmail.com"));

        System.out.println(listaContactos.get(0));

        for(int i=0; i<listaContactos.size(); i++){
            System.out.println(listaContactos.get(i));
        }
        listaContactos.remove(c1);
        for(Contacto c : listaContactos) {
            System.out.println(c);
        }


    }
}
