package ComparableComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class LivroById implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class Main {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>(5);
        livros.add(new Livro(1L,"Ladrão de Raios",2005));
        livros.add(new Livro(3L,"Maldição do Titã",2007));
        livros.add(new Livro(5L,"O último olimpiano",2009));
        livros.add(new Livro(2L,"Mar de Monstros",2006));
        livros.add(new Livro(4L,"Batalha do labirinto",2008));


        for(Livro livro: livros){
            System.out.println(livro.toString());
        }
        System.out.println("----------------------------");
        Collections.sort(livros);

        for(Livro livro: livros){
            System.out.println(livro.toString());
        }

        System.out.println("----------------------------");
        //Collections.sort(livros,new LivroById());
        livros.sort(new LivroById());
        for(Livro livro: livros){
            System.out.println(livro.toString());
        }

    }
}
