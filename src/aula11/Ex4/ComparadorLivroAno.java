package aula11.Ex4;

import java.util.Comparator;

public class ComparadorLivroAno implements Comparator<Livro> {

@Override
public int compare(Livro o1, Livro o2) {
    return o2.getAno()-o1.getAno();
}


}
