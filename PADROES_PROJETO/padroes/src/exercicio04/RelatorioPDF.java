package exercicio04;

public class RelatorioPDF extends GeradorRelatorio {
    @Override
    protected void formatar() {
        System.out.println("Gerando relatório em PDF");
        System.out.println("1 - Inserindo dados no arquivo de texto");
        System.out.println("2 - Estilizando titulos e paragráfos");
        System.out.println("3 - Salvando em formato .pdf");
    }
}