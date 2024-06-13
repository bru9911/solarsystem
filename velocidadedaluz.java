public class VelocidadeDaLuz {
    public static void main(String[] args) {
        // Definindo a velocidade da luz em metros por segundo
        double velocidadeDaLuzMetrosPorSegundo = 299792458;

        // Calculando a velocidade da luz em quilômetros por segundo
        double velocidadeDaLuzQuilometrosPorSegundo = velocidadeDaLuzMetrosPorSegundo / 1000;

        // Calculando a velocidade da luz em quilômetros por hora
        double velocidadeDaLuzQuilometrosPorHora = velocidadeDaLuzQuilometrosPorSegundo * 3600;

        // Calculando a velocidade da luz em milhas por segundo
        double velocidadeDaLuzMilhasPorSegundo = velocidadeDaLuzMetrosPorSegundo / 1609.34;

        // Imprimindo os resultados
        System.out.println("A velocidade da luz é:");
        System.out.println(velocidadeDaLuzMetrosPorSegundo + " metros por segundo");
        System.out.println(velocidadeDaLuzQuilometrosPorSegundo + " quilômetros por segundo");
        System.out.println(velocidadeDaLuzQuilometrosPorHora + " quilômetros por hora");
        System.out.println(velocidadeDaLuzMilhasPorSegundo + " milhas por segundo");
    }
}
