public class App {
    public static void main(String[] args) {
        GerenciamentoAnimais gerenciador = new GerenciamentoAnimais();
        Menu menu = new Menu(gerenciador);
        menu.exibirMenu();
    }
}
