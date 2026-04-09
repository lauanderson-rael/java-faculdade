package questao01;

public abstract class ExportarRelatorio {
    public final void exportar() {
        System.out.println("Coletando dados do relatorio...");
        formatar();
        System.out.println("Relatório exportado com sucesso!\n");
    }

    protected abstract void formatar();
}