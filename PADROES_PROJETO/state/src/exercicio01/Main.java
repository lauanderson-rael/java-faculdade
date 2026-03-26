package exercicio01;

public class Main {
    public static void main(String[] args) {
        ElevadorContext elevador1 = new ElevadorContext();
        elevador1.exibirEstadoAtual();

        elevador1.subir();
        elevador1.exibirEstadoAtual();

        elevador1.descer();
        elevador1.exibirEstadoAtual();

        elevador1.parar();
        elevador1.exibirEstadoAtual();
    }
}
