package sistemaComercioEletronico.pedido;

import sistemaComercioEletronico.cliente.Cliente;
import sistemaComercioEletronico.pagamento.Pagamento;

import java.util.List;

public class Pedido {
    private String data;
    private Double total;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Pagamento pagamento;
}
