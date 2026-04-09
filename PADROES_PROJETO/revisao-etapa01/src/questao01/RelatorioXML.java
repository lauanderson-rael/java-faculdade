package questao01;

public class RelatorioXML extends ExportarRelatorio {
    @Override
    protected void formatar() {
        System.out.println("Exportando relatório em formato XML.");
        System.out.println("1 - Inserindo dados no arquivo relatorio.xml");
        System.out.println("2 - Salvando arquivo");
    }
}