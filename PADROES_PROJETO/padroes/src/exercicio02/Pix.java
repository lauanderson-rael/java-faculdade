package exercicio02;

public class Pix extends Pagamento {
    protected void validar() { System.out.println("Criando QR Code dinâmico..."); }
    protected void processar(double v) { System.out.println("Transferência instantânea via Banco Central..."); }
}