package exercicio04;

public class RelatorioHTML extends GeradorRelatorio {
    @Override
    protected void formatar() {
        System.out.println("Gerando relatório em página HTML.");
        System.out.println("1 - Inserindo dados no arquivo index.html");
        System.out.println("2 - Ajustando estilização css");
    }
}