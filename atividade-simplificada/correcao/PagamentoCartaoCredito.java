package correcao;

public class PagamentoCartaoCredito implements MetodoPagamento {
    @Override
    public void pagar(Pedido pedido, double total) {
        // Lógica para processar o pagamento com cartão de crédito
        System.out.println("Pagamento de R$" + total + " realizado com cartão de crédito para o pedido: " + pedido.getId());
    }
    
}
