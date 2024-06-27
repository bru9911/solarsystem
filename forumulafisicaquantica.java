public class FormulaFisicaQuantica {

    public static void main(String[] args) {
        // Vamos calcular a energia total usando a fórmula E = K + V
        double energiaCinetica = calcularEnergiaCinetica(1.5); // Exemplo de energia cinética
        double energiaPotencial = calcularEnergiaPotencial(2.0); // Exemplo de energia potencial
        
        double energiaTotal = energiaCinetica + energiaPotencial;
        
        System.out.println("Energia Total do Sistema Quântico: " + energiaTotal);
    }
    
    // Método para calcular a energia cinética (exemplo)
    public static double calcularEnergiaCinetica(double massa) {
        double velocidade = 3.0; // Exemplo de velocidade
        return 0.5 * massa * velocidade * velocidade; // E = 1/2 * m * v^2
    }
    
    // Método para calcular a energia potencial (exemplo)
    public static double calcularEnergiaPotencial(double altura) {
        double constanteGravitacional = 9.8; // Exemplo de constante gravitacional
        double massa = 1.0; // Exemplo de massa
        return massa * constanteGravitacional * altura; // E = m * g * h
    }
}
