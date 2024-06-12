import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Agenda {
    private List<Evento> eventos;

    public Agenda() {
        eventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void visualizarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Não há eventos cadastrados.");
        } else {
            System.out.println("Eventos na Agenda");
            for (Evento evento : eventos) {
                System.out.println(evento);
            }
        }
    }

    public void excluirEvento(Scanner teclado) {
        if (eventos.isEmpty()) {
            System.out.println("Não há eventos para excluir.");
            return;
        }

        System.out.print("Digite o número do evento que deseja excluir: ");
        int numeroEvento = teclado.nextInt();
        if (numeroEvento < 1 || numeroEvento > eventos.size()) {
            System.out.println("Número de evento inválido.");
            return;
        }

        eventos.remove(numeroEvento - 1);
        System.out.println("Evento removido!");
    }
}