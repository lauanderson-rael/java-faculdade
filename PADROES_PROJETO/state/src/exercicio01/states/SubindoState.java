package exercicio01.states;

import exercicio01.ElevadorContext;

public class SubindoState implements EstadoElevador {
    @Override
    public void subindo(ElevadorContext elevador) {
        System.out.println("Comando solicitado: Subir");
        System.out.println("O Elevador já está subindo!");
    }

    @Override
    public void descendo(ElevadorContext elevador) {
        System.out.println("Comando solicitado: Descer");
        System.out.println("Impossível descer agora! O Elevador está SUBINDO!");
    }

    @Override
    public void parado(ElevadorContext elevador) {
        System.out.println("Comando solicitado: Parar");
        System.out.println("Elevador parado!");
        elevador.setEstado(new ParadoState());
    }

    @Override
    public String getNomeEstado() {
        return "Subindo";
    }

}
