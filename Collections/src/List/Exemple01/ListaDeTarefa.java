package List.Exemple01;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefa {
    private List<Tarefa> tarefaList = new ArrayList<Tarefa>();

    public void adicionarTarefa(String descricao){
        if (!descricao.isEmpty()){
            tarefaList.add(new Tarefa(descricao));
        }
    }

    public void removerTarefa(String descricao){
        if (!descricao.isEmpty()){
           tarefaList.removeIf(n->(n.getDescricao().equals(descricao)));
        }

    }

    public Integer obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public String obterDescricoesTarefas(){
        return tarefaList.toString();
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }
}
