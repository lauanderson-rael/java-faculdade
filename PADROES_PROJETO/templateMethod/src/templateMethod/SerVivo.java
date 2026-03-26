package templateMethod;

public abstract class SerVivo {

    int idade;

    public void inicializar() {
        nascer();
        crescer();
        reproduzir();
        if (idade > 100) {
            morrer();
        }
    }

    public abstract void nascer();
    public abstract void crescer();
    public abstract void reproduzir();
    public abstract void morrer();

}