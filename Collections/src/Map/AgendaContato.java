package Map;

import Set.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String,String> mapContato;

    public AgendaContato(){
        this.mapContato = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone){
        this.mapContato.putIfAbsent(nome,telefone);
    }

    public void removerContato(String nome){
        this.mapContato.remove(nome);
    }

    public void exibirContatos(){
        for(String key: mapContato.keySet()){
            System.out.println(key + " : " + mapContato.get(key));
        }
    }

    public String pesquisarPorNome(String nome){
        return nome + " : " + mapContato.get(nome);
    }
}
