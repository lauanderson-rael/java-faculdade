package exercicio03;

public abstract class Importador {
    // Template Method
    public final void importar(String arquivo) {
        System.out.println("Abrindo arquivo: " + arquivo);
        processarDados();
        System.out.println("Fechando arquivo e salvando no banco.\n");
    }

    protected abstract void processarDados();
}