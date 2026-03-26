# Elevador
Modelar estados do elevador, (subindo, descendo e parado)
Para gerenciar comandos e portas.



Exemplo de estrutura de pastas (Packages)
src/
└── br.com.faculdade.pedido/
    ├── Main.java              (Onde você testa)
    ├── PedidoContext.java     (A classe principal que "muda de estado")
    └── states/                (PACOTE SÓ PARA OS ESTADOS)
        ├── EstadoPedido.java  (Interface ou Classe Abstrata)
        ├── AguardandoPagamento.java
        ├── Pago.java
        ├── Enviado.java
        └── Cancelado.java