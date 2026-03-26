package exercicio01;

import exercicio01.states.EstadoElevador;
import exercicio01.states.ParadoState;

public class ElevadorContext {
    private EstadoElevador estado;

    public ElevadorContext() {
        this.estado = new ParadoState();
    }

    public void setEstado(EstadoElevador estado) {
        this.estado = estado;
    }

    public EstadoElevador getEstado() {
        return estado;
    }

    // funcoes
    public void subir(){
        estado.subindo(this);
    }

    public void descer(){
        estado.descendo(this);
    }

    public  void parar(){
        estado.parado(this);
    }

    public void exibirEstadoAtual() {
        System.out.println("Estado atual do Elevador: " + estado.getNomeEstado());
        System.out.println("---------------------------------------------");
    }
}
