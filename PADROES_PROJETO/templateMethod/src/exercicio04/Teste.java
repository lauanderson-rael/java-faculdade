package exercicio04;

public class Teste {
    public static void main(String[] args) {
        GeradorRelatorio r1 = new RelatorioPDF();
        r1.gerar();

        GeradorRelatorio r2 = new RelatorioHTML();
        r2.gerar();

        GeradorRelatorio r3 = new RelatorioPlanilha();
        r3.gerar();
    }
}