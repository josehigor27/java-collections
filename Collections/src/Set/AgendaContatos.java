package Set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContato;


    public AgendaContatos() {
        this.setContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){

        this.setContato.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(setContato);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: setContato){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contato = null;
        for(Contato c: setContato){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contato = c;
                break;
            }
        }
        return contato;
    }
}
