package exercicio04;

public class RelatorioPlanilha extends GeradorRelatorio {
    @Override
    protected void formatar() {
        System.out.println("Gerando relatório em arquivo .xlsx (Planilha)");
    }
}
