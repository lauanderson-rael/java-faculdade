package exercicio02;

public class Cartao extends Pagamento {
    protected void validar() {
        System.out.println("Verificando limite do cartão...");
    }
    protected void processar(double v) {
        System.out.println("Debitando da operadora...");
    }
}