package exercicio02;

public class Teste {
    public static void main(String[] args) {
        Pagamento p1 = new Pix();
        p1.realizarPagamento(50.0);

        Pagamento p2 = new Cartao();
        p2.realizarPagamento(150.0);
    }
}