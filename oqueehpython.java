public class LinguagemPython {
    public static void main(String[] args) {
        // Informações sobre a linguagem Python
        String nome = "Python";
        int anoCriacao = 1991;
        String criador = "Guido van Rossum";
        String paradigma = "Multiparadigma: orientação a objetos, imperativo, funcional";
        boolean tipagem = false; // Python é uma linguagem de tipagem dinâmica
        
        // Imprimindo informações
        System.out.println("Informações sobre a linguagem " + nome + ":");
        System.out.println("Ano de criação: " + anoCriacao);
        System.out.println("Criador: " + criador);
        System.out.println("Paradigma: " + paradigma);
        System.out.println("Tipagem: " + (tipagem ? "Dinâmica" : "Estática"));
    }
