package exercicio01;

public abstract class CalculadorImposto {
    // Template Method
    public void exibirCalculo(double valor) {
        double resultado = valor * getAliquota();
        System.out.println("Imposto: R$ " + resultado);
    }

    public abstract double getAliquota();
}