package questao01;

public class RelatorioPDF extends ExportarRelatorio {
    @Override
    protected void formatar() {
        System.out.println("Exportando relatório em PDF");
        System.out.println("1 - Inserindo dados no arquivo de texto");
        System.out.println("2 - Estilizando titulos");
        System.out.println("3 - Salvando em formato .pdf");
    }
}