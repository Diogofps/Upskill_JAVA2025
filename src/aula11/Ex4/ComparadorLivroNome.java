package aula11.Ex4;
import java.util.Comparator;

public class ComparadorLivroNome implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }

}
