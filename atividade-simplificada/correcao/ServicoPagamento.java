package correcao;

public class ServicoPagamento {
    public void processar(Pedido pedido, double total, MetodoPagamento metodoPagamento) {
        // Processa o pagamento
        metodoPagamento.pagar(pedido, total);

      
    }
}
