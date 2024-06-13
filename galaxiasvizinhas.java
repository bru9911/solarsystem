import java.util.ArrayList;

public class GalaxiasVizinhas {
    public static void main(String[] args) {
        // Criando uma lista de galáxias vizinhas
        ArrayList<String> galaxiasVizinhas = new ArrayList<>();
        galaxiasVizinhas.add("Galáxia de Andrômeda");
        galaxiasVizinhas.add("Grande Nuvem de Magalhães");
        galaxiasVizinhas.add("Pequena Nuvem de Magalhães");
        galaxiasVizinhas.add("Galáxia do Triângulo");
        galaxiasVizinhas.add("Galáxia de Barnard");

        // Imprimindo as galáxias vizinhas
        System.out.println("Galáxias Vizinhas à Via Láctea:");
        System.out.println("---------------------------------");
        for (String galaxia : galaxiasVizinhas) {
            System.out.println(galaxia);
        }
        System.out.println("---------------------------------");
    }
}
