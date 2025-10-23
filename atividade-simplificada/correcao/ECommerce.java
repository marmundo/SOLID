package correcao;

public class ECommerce {
    public static void main(String[] args) {
        ServicoCalculo servicoCalculo = new ServicoCalculo();
        ServicoPagamento servicoPagamento = new ServicoPagamento();
        ServicoNotificacao servicoNotificacao = new ServicoEmail();
        PedidoRepositorio pedidoRepositorio = new PedidoRepositoryMySQL();

        ProcessadorDePedidos processadorDePedidos = new ProcessadorDePedidos(
                servicoCalculo,
                servicoPagamento,
                servicoNotificacao,
                pedidoRepositorio
        );

        Pedido pedido = new Pedido("12345");
        pedido.adicionarItem(new Item("Produto A", 100.0));
        pedido.adicionarItem(new Item("Produto B", 50.0));
        
        MetodoPagamento metodoPagamento = new PagamentoCartaoCredito();
        processadorDePedidos.processar(pedido, metodoPagamento);
    }
}
