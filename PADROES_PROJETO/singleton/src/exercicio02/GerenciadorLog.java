package exercicio02;

public class GerenciadorLog {
    // Instância única privada e estática
    private static GerenciadorLog instancia;
    private int contadorMensagens;

    // Construtor privado: impede 'new GerenciadorLog()'
    private GerenciadorLog() {
        this.contadorMensagens = 0;
        System.out.println("[SISTEMA] Canal de Log inicializado com sucesso.");
    }

    // Ponto de acesso global
    public static GerenciadorLog getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorLog();
        }
        return instancia;
    }

    public void registrar(String mensagem) {
        contadorMensagens++;
        System.out.println("[LOG #" + contadorMensagens + "]: " + mensagem);
    }
}

