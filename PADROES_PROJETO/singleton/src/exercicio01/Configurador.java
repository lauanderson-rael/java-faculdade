package exercicio01;

public class Configurador {
    private static Configurador instancia;

    private String nomeSistema;
    private String versao;

    // CONSTRUTOR PRIVADO: Impede o uso de 'new Configurador()'
    private Configurador() {
        this.nomeSistema = "Sistema Acadêmico Java";
        this.versao = "1.0.2";
        System.out.println("-> Configurações carregadas do 'banco de dados'...");
    }

    // METODO GLOBAL: Ponto de acesso único
    public static Configurador getInstance() {
        if (instancia == null) {
            instancia = new Configurador();
        }
        return instancia;
    }

    // Métodos de acesso
    public String getNomeSistema() {
        return nomeSistema;
    }

    public String getVersao() {
        return versao;
    }
}
