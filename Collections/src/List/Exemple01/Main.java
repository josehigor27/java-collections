package List.Exemple01;

public class Main {
    public static void main(String[] args) {
        ListaDeTarefa listaDeTarefa = new ListaDeTarefa();
        listaDeTarefa.adicionarTarefa("Teste 01");
        listaDeTarefa.adicionarTarefa("Teste 02");
        listaDeTarefa.adicionarTarefa("Teste 03");
        listaDeTarefa.adicionarTarefa("Teste 01");
        listaDeTarefa.adicionarTarefa("Teste 02");

        System.out.println(listaDeTarefa.obterDescricoesTarefas());
        System.out.println("Há "+listaDeTarefa.obterNumeroTotalTarefas()+" tarefas.");
        System.out.println("----------------------");
        //Teste do método equals.
        System.out.println(listaDeTarefa.getTarefaList().get(0).equals(listaDeTarefa.getTarefaList().get(3)));
        System.out.println("----------------------");
        listaDeTarefa.removerTarefa("Teste 01");
        System.out.println(listaDeTarefa.obterDescricoesTarefas());
        System.out.println(listaDeTarefa.obterNumeroTotalTarefas());
        System.out.println("----------------------");
        listaDeTarefa.removerTarefa("Teste 03");
        System.out.println(listaDeTarefa.obterDescricoesTarefas());
        System.out.println(listaDeTarefa.obterNumeroTotalTarefas());
        System.out.println("----------------------");
        listaDeTarefa.removerTarefa("Teste 02");
        System.out.println(listaDeTarefa.obterDescricoesTarefas());
        System.out.println(listaDeTarefa.obterNumeroTotalTarefas());
    }
}
