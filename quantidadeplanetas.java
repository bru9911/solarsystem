public class QuantidadePlanetas {

    public static void main(String[] args) {
        // Array com os nomes dos planetas do sistema solar
        String[] planetas = {
            "Mercúrio", "Vênus", "Terra", "Marte", 
            "Júpiter", "Saturno", "Urano", "Netuno"
        };

        // Contando o número de planetas
        int quantidadePlanetas = planetas.length;

        // Exibindo a quantidade de planetas
        System.out.println("O sistema solar possui " + quantidadePlanetas + " planetas:");
        
        // Exibindo os nomes dos planetas
        for (String planeta : planetas) {
            System.out.println("- " + planeta);
        }
    }
}
