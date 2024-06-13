import java.util.Scanner;

public class ProbabilidadeVidaExtraterrestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir os valores dos fatores
        System.out.println("Insira os valores dos seguintes fatores:");
        System.out.print("Taxa de formação de estrelas na Via Láctea (R*): ");
        double taxaDeFormacaoDeEstrelas = scanner.nextDouble();

        System.out.print("Fração de estrelas que têm planetas (fp): ");
        double fracaoEstrelasComPlanetas = scanner.nextDouble();

        System.out.print("Número médio de planetas que podem potencialmente sustentar a vida por estrela que tem planetas (ne): ");
        double numeroMedioDePlanetasParaVida = scanner.nextDouble();

        System.out.print("Fração de planetas que realmente desenvolvem vida (fl): ");
        double fracaoPlanetasComVida = scanner.nextDouble();

        System.out.print("Fração de planetas com vida inteligente (fi): ");
        double fracaoPlanetasComVidaInteligente = scanner.nextDouble();

        System.out.print("Fração de planetas com vida inteligente que desenvolvem tecnologia capaz de transmitir sinais detectáveis para o espaço (fc): ");
        double fracaoPlanetasComTecnologia = scanner.nextDouble();

        System.out.print("Tempo que tais civilizações transmitem sinais detectáveis para o espaço (L): ");
        double tempoTransmissaoSinais = scanner.nextDouble();

        // Calcula o número estimado de civilizações extraterrestres
        double numeroDeCivilizacoes = taxaDeFormacaoDeEstrelas * fracaoEstrelasComPlanetas *
                numeroMedioDePlanetasParaVida * fracaoPlanetasComVida * fracaoPlanetasComVidaInteligente *
                fracaoPlanetasComTecnologia * tempoTransmissaoSinais;

        // Imprime o resultado
        System.out.println("O número estimado de civilizações extraterrestres com as quais poderíamos potencialmente comunicar é: " + numeroDeCivilizacoes);
    }
}
