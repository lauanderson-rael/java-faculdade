package exercicio01.states;

import exercicio01.ElevadorContext;

public class ParadoState implements EstadoElevador {

    public enum EstadoPorta {
        ABERTA,
        FECHADA
    }

    private EstadoPorta porta = EstadoPorta.FECHADA;

    public void abrirPorta() {
        if (porta == EstadoPorta.ABERTA) {
            System.out.println("Porta já está aberta!");
        } else {
            porta = EstadoPorta.ABERTA;
            System.out.println("Abrindo porta...");
        }
    }

    public void fecharPorta() {
        if (porta == EstadoPorta.FECHADA) {
            System.out.println("Porta já está fechada!");
        } else {
            porta = EstadoPorta.FECHADA;
            System.out.println("Fechando porta...");
        }
    }

    @Override
    public void subindo(ElevadorContext elevador) {
        if (porta == EstadoPorta.ABERTA) {
            System.out.println("Não pode subir com a porta aberta!");
            return;
        }
        System.out.println("Comando solicitado: Subir");
        System.out.println("Elevador subindo!");
        elevador.setEstado(new SubindoState());
    }

    @Override
    public void descendo(ElevadorContext elevador) {
        if (porta == EstadoPorta.ABERTA) {
            System.out.println("Não pode subir com a porta aberta!");
            return;
        }

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
        return "Parado (" + porta + ")";
    }

}
