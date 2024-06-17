public class MarteInfo {
    // Definindo constantes para as informações de Marte
    private static final String NOME = "Marte";
    private static final double DIAMETRO_KM = 6779; // diâmetro em quilômetros
    private static final double GRAVIDADE_M_S2 = 3.7; // gravidade na superfície em m/s²
    private static final double PERIODO_ROTACAO_HORAS = 24.6; // período de rotação em horas
    private static final double PERIODO_ORBITAL_TERRESTRE_DIAS = 687; // período orbital em dias terrestres
    private static final String COMPOSICAO_ATMOSFERA = "Dióxido de carbono (95.32%), Nitrogênio (2.7%), Argônio (1.6%)"; // composição da atmosfera

    // Método principal para exibir informações
    public static void main(String[] args) {
        exibirInformacoes();
    }

    // Método para exibir informações detalhadas sobre Marte
    private static void exibirInformacoes() {
        System.out.println("Informações sobre o planeta " + NOME + ":");
        System.out.println("Diâmetro: " + DIAMETRO_KM + " quilômetros");
        System.out.println("Gravidade na superfície: " + GRAVIDADE_M_S2 + " m/s²");
        System.out.println("Período de rotação: " + PERIODO_ROTACAO_HORAS + " horas");
        System.out.println("Período orbital: " + PERIODO_ORBITAL_TERRESTRE_DIAS + " dias terrestres");
        System.out.println("Composição da atmosfera: " + COMPOSICAO_ATMOSFERA);
    }
}
