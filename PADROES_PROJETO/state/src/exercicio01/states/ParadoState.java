package exercicio01.states;

import exercicio01.ElevadorContext;

public class ParadoState implements EstadoElevador {
    @Override
    public void subindo(ElevadorContext elevador) {
        System.out.println("Comando solicitado: Subir");
        System.out.println("Elevador subindo!");
        elevador.setEstado(new SubindoState());
    }

    @Override
    public void descendo(ElevadorContext elevador) {
        System.out.println("Comando solicitado: Descer");
        System.out.println("Elevador descendo!");
        elevador.setEstado(new DescendoState());
    }

    @Override
    public void parado(ElevadorContext elevador) {
        System.out.println("Comando solicitado: Parar");
        System.out.println("Elevador já está parado!");
    }

    @Override
    public String getNomeEstado() {
        return "Parado";
    }
}
