import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private GerenciamentoAnimais gerenciador;
    private Scanner scanner;

    public Menu(GerenciamentoAnimais gerenciador) {
        this.gerenciador = gerenciador;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean running = true;

        while (running) {
            System.out.println("--MENU--");
            System.out.println("1. Carregar Animais");
            System.out.println("2. Listar Animais");
            System.out.println("3. Salvar Animais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    carregarAnimaisMenu();
                    break;
                case 2:
                    gerenciador.listarAnimais();
                    break;
                case 3:
                    try {
                        gerenciador.salvarAnimais("animais_salvos.txt");
                        System.out.println("Animais salvos com sucesso.");
                    } catch (IOException e) {
                        System.out.println("Erro ao salvar animais: " + e.getMessage());
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("--PROGRAMA FINALIZADO--");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    private void carregarAnimaisMenu() {
        System.out.println("Escolha o tipo de animal para carregar:");
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        System.out.println("3. Crocodilo");
        System.out.println("4. Girafa");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        String tipoAnimal;
        switch (opcao) {
            case 1:
                tipoAnimal = "Cachorro";
                break;
            case 2:
                tipoAnimal = "Gato";
                break;
            case 3:
                tipoAnimal = "Crocodilo";
                break;
            case 4:
                tipoAnimal = "Girafa";
                break;
            default:
                System.out.println("Opção inválida. Retornando ao menu principal.");
                return;
        }

        try {
            gerenciador.carregarAnimais("animais.txt", tipoAnimal);
            System.out.println("Animais do tipo " + tipoAnimal + " carregados com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar animais: " + e.getMessage());
        }
    }
}
