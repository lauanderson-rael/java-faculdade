package templateMethod;


public class Teste{
    public static void main(String[] args) {
        SerVivo joao = new Cachorro();
        joao.idade = 10;
        joao.inicializar();
    }
}