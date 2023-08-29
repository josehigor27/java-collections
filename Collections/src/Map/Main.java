package Map;

public class Main {
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.adicionarContato("José","61983258876");
        agendaContato.adicionarContato("Higor","61982467391");
        agendaContato.adicionarContato("Fulano","62996788324");
        agendaContato.exibirContatos();
        System.out.println("-----------------------");
        agendaContato.removerContato("Fulano");
        agendaContato.exibirContatos();
        System.out.println("---------------");
        System.out.println(agendaContato.pesquisarPorNome("Higor"));
    }
}
