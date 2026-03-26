package exercicio01;

public class Teste {
    public static void main(String[] args) {
        double valorProduto = 1000.0;

        CalculadorImposto imposto = new ICMS();
        imposto.exibirCalculo(valorProduto);

        imposto = new IR();
        imposto.exibirCalculo(valorProduto);

        imposto = new ISS();
        imposto.exibirCalculo(valorProduto);

    }
}