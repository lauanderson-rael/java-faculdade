package exercicio04;

public abstract class GeradorRelatorio {
    public final void gerar() {
        System.out.println("Coletando dados do banco...");
        formatar();
        System.out.println("Enviando para impressora ou download.\n");
    }

    protected abstract void formatar();
}