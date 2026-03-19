package templateMethod;

public class SerVivo {
    public void inicializar(){
        nascer();
        crescer();
        reproduzir();
        morrer();
    }

    public abstract void nascer();
    public abstract void crescer();
    public abstract void reproduzir();
    public abstract void morrer();
}
