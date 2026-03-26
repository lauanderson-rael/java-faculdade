package templateMethod;

public class Mamifero extends SerVivo {

    public void nascer() {
        System.out.println("Mamífero nascendo.");
    }

    public void crescer() {
        System.out.println("Mamífero crescendo.");
    }

    public void reproduzir() {
        System.out.println("Mamífero reproduzindo.");
    }

    public void morrer() {
        System.out.println("Mamífero se foi.");
    }
}