package exercicio02;

public class Boleto extends Pagamento {
    protected void validar() { System.out.println("Gerando código de barras..."); }
    protected void processar(double v) { System.out.println("Aguardando compensação bancária..."); }
}