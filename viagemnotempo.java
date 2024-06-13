import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ViagemNoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir a data atual
        System.out.println("Digite a data atual (no formato YYYY-MM-DD):");
        String dataAtualStr = scanner.nextLine();

        // Converte a string em uma data
        LocalDate dataAtual = LocalDate.parse(dataAtualStr);

        // Solicita ao usuário para inserir a quantidade de anos para viajar no tempo
        System.out.println("Quantos anos você deseja viajar no tempo?");
        int anosParaViajar = scanner.nextInt();

        // Calcula a nova data após a viagem no tempo
        LocalDate novaData = dataAtual.plusYears(anosParaViajar);

        // Formata a nova data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Imprime a nova data
        System.out.println("Após viajar " + anosParaViajar + " anos no tempo, a nova data será: " + novaData.format(formatter));
    }
}
