package exerciciosTemplateMethod;

public class Imposto {

// fluxo do cálculo do imposto.
    public final double calcula(Orcamento orcamento) {
        if (deveUsarTaxaMaxima(orcamento)) {
            return taxaMaxima(orcamento);
        } else {
            return taxaMinima(orcamento);
        }
    }

    protected abstract boolean deveUsarTaxaMaxima(Orcamento orcamento);
    protected abstract double taxaMaxima(Orcamento orcamento);
    protected abstract double taxaMinima(Orcamento orcamento);
}