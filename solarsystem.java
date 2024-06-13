public class SistemaSolar {
    public static void main(String[] args) {
        // Array com os nomes dos planetas
        String[] planetas = {"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno"};

        // Array com as distâncias médias dos planetas ao sol (em milhões de km)
        double[] distanciasAoSol = {57.9, 108.2, 149.6, 227.9, 778.6, 1433.5, 2872.5, 4495.1};

        // Array com os diâmetros médios dos planetas (em milhares de km)
        double[] diametros = {4.88, 12.1, 12.742, 6.779, 139.822, 116.464, 50.724, 49.244};

        // Array com as massas dos planetas (em massas da Terra)
        double[] massas = {0.055, 0.815, 1.0, 0.107, 317.8, 95.2, 14.6, 17.2};

        // Imprimindo informações sobre cada planeta
        System.out.println("Informações sobre os planetas do sistema solar:");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println("Planeta: " + planetas[i]);
            System.out.println("Distância média ao Sol: " + distanciasAoSol[i] + " milhões de km");
            System.out.println("Diâmetro médio: " + diametros[i] + " milhares de km");
            System.out.println("Massa: " + massas[i] + " massas da Terra");
            System.out.println("---------------------------------------------");
        }
    }
}
