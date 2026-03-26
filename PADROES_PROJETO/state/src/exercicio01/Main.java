package exercicio01;

import exercicio01.states.EstadoElevador;
import exercicio01.states.ParadoState;

public class Main {
    public static void main(String[] args) {
        ElevadorContext elevador1 = new ElevadorContext();
        elevador1.exibirEstadoAtual();

        elevador1.subir();
        elevador1.exibirEstadoAtual();

        elevador1.descer();
        elevador1.parar();
    }
}
