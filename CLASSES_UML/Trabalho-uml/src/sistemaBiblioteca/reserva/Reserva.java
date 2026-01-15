package sistemaBiblioteca.reserva;

import sistemaBiblioteca.livro.Livro;
import sistemaBiblioteca.usuario.Usuario;

public class Reserva {
    private String dataSolicitacao;
    private String dataExpiracao;
    private Usuario usuario;
    private Livro livro;
}
