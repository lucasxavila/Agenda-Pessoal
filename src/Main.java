import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("usuario", "12345");
        
        boolean login = false;
        while (login == false) {
            System.out.print("Digite o nome de usuário: ");
            String nomeUsuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            login = usuario.login(nomeUsuario, senha);
            if (login == false) {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
    }
}

        Agenda agenda = new Agenda();

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarEvento(scanner, agenda);
                    break;
                case 2:
                    agenda.visualizarEventos();
                    break;
                case 3:
                    agenda.excluirEvento(scanner);
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println(" Menu ");
        System.out.println("1. Adicionar Evento");
        System.out.println("2. Visualizar Eventos");
        System.out.println("3. Excluir Evento");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarEvento(Scanner scanner, Agenda agenda) {
        System.out.println("Digite o título do evento: \n");
        String titulo = scanner.nextLine();
        System.out.println("Digite a data e hora do evento: \n");
        String dataHora = scanner.nextLine();
        System.out.println("Digite a localização do evento: \n");
        String localizacao = scanner.nextLine();
        System.out.println("Digite a descrição do evento: \n");
        String descricao = scanner.nextLine();

        Evento evento = new Evento(titulo, dataHora, localizacao, descricao);
        agenda.adicionarEvento(evento);
        System.out.println("Evento adicionado com sucesso!");

        try (FileWriter arquivo = new FileWriter("agenda_log.txt", true)) {
            arquivo.write("Evento adicionado: " + evento);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }
}