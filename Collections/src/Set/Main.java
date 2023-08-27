package Set;


import ComparableComparator.Comparable.Livro;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Livro> livros = new HashSet<>();
        livros.add(new Livro(1L,"Ladrão de Raios",2005));
        livros.add(new Livro(3L,"Maldição do Titã",2007));
        livros.add(new Livro(5L,"O último olimpiano",2009));
        livros.add(new Livro(4L,"Batalha do labirinto",2008));

        System.out.println(livros);
    }

}
