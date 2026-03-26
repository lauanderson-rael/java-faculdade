package exercicio01;

public class Main {
    public static void main(String[] args) {
        Configurador config1 = Configurador.getInstance();
        System.out.println("Config 1: " + config1.getNomeSistema() + " v" + config1.getVersao());

        Configurador config2 = Configurador.getInstance();
        System.out.println("Config 2: " + config2.getNomeSistema());


        // Verificando se os objetos ocupam o mesmo endereço de memória
        if (config1 == config2) {
            System.out.println("\nSucesso: config1 e config2 apontam para a MESMA instância!");
        } else {
            System.out.println("\nErro: Existem instâncias diferentes na memória.");
        }
    }
}
