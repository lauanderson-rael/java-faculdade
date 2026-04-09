package questao01;

public class RelatorioCSV extends ExportarRelatorio {
    @Override
    protected void formatar() {
        System.out.println("Exportando relatório em arquivo CSV");
        System.out.println("1 - Inserindo dados no arquivo relatorio.csv");
        System.out.println("2 - Salvando o arquivo");
    }
}
