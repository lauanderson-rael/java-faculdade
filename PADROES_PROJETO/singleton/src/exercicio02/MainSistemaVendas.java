package exercicio02;

public class MainSistemaVendas {
    public static void main(String[] args) {
        // Parte A do sistema
        GerenciadorLog logVendas = GerenciadorLog.getInstance();
        logVendas.registrar("Usuário 'Admin' fez login.");

        // Parte B do sistema
        GerenciadorLog logEstoque = GerenciadorLog.getInstance();
        logEstoque.registrar("Produto 'Notebook' adicionado ao carrinho.");

        // PROVA: O contador de mensagens continua subindo porque o objeto é o MESMO
        logVendas.registrar("Finalizando checkout...");

        System.out.println("\nVerificação de Identidade:");
        System.out.println("Mesmo objeto? " + (logVendas == logEstoque));
    }
}
