package correcao;

public class PagamentoBoleto implements MetodoPagamento {
    @Override
    public void pagar(Pedido pedido, double total) {
        // Lógica para processar o pagamento com boleto
        System.out.println("Pagamento de R$" + total + " realizado com boleto para o pedido: " + pedido.getId());
    }
}
