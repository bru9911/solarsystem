import java.util.Scanner;

public class Marketplace {
    // Banco de dados simulado - arrays para armazenar produtos, preços e quantidades
    private static String[] produtos = {"Celular", "Notebook", "TV", "Fone de Ouvido"};
    private static double[] precos = {1500.0, 3000.0, 2500.0, 300.0};
    private static int[] quantidades = {10, 5, 8, 20};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    listarProdutos();
                    break;
                case 2:
                    comprarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo do marketplace. Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    // Método para exibir o menu de opções
    private static void exibirMenu() {
        System.out.println("\nBem-vindo ao Marketplace");
        System.out.println("1 - Listar produtos disponíveis");
        System.out.println("2 - Comprar produto");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Método para listar os produtos disponíveis com seus preços e quantidades
    private static void listarProdutos() {
        System.out.println("\nProdutos disponíveis:");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + ". " + produtos[i] + " - R$" + precos[i] + " - Quantidade disponível: " + quantidades[i]);
        }
    }

    // Método para comprar um produto
    private static void comprarProduto(Scanner scanner) {
        listarProdutos();
        System.out.print("Escolha o número do produto que deseja comprar: ");
        int escolhaProduto = scanner.nextInt();

        if (escolhaProduto < 1 || escolhaProduto > produtos.length) {
            System.out.println("Produto não encontrado. Operação cancelada.");
            return;
        }

        int indiceProduto = escolhaProduto - 1;

        if (quantidades[indiceProduto] > 0) {
            quantidades[indiceProduto]--;
            System.out.println("Produto '" + produtos[indiceProduto] + "' comprado com sucesso!");
            System.out.println("Total pago: R$" + precos[indiceProduto]);
        } else {
            System.out.println("Desculpe, o produto '" + produtos[indiceProduto] + "' está esgotado.");
        }
    }
}
