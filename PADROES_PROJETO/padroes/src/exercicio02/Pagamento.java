package exercicio02;

public abstract class Pagamento {
    // Template Method: define a ordem dos passos
    public final void realizarPagamento(double valor) {
        validar();
        processar(valor);
        System.out.println("Pagamento de R$ " + valor + " finalizado com sucesso!\n");
    }

    protected abstract void validar();
    protected abstract void processar(double v);
}