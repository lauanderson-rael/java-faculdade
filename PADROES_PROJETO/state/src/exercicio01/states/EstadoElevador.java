package exercicio01.states;

import exercicio01.ElevadorContext;

public interface EstadoElevador {
    void subindo(ElevadorContext elevador);
    void descendo(ElevadorContext elevador);
    void parado(ElevadorContext elevador);

    String getNomeEstado();
}
