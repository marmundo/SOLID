package correcao;

public class ProcessadorDePedidos {
    private ServicoCalculo servicoCalculo;
    private ServicoPagamento servicoPagamento;
    private ServicoNotificacao servicoNotificacao;
    private PedidoRepositorio pedidoRepositorio;

    public ProcessadorDePedidos(ServicoCalculo servicoCalculo, ServicoPagamento servicoPagamento,
                                ServicoNotificacao servicoNotificacao, PedidoRepositorio pedidoRepositorio) {
        this.servicoCalculo = servicoCalculo;
        this.servicoPagamento = servicoPagamento;
        this.servicoNotificacao = servicoNotificacao;
        this.pedidoRepositorio = pedidoRepositorio;
    }

    public void processar(Pedido pedido, MetodoPagamento metodoPagamento) {
        double total = servicoCalculo.calcularTotal(pedido);
        System.out.println("Processando pedido: " + pedido.getId() + " com total: R$" + total);
        servicoPagamento.processar(pedido, total, metodoPagamento);
        pedidoRepositorio.salvar(pedido);
        servicoNotificacao.enviarEmailConfirmacao(pedido);
        System.out.println("Pedido processado com sucesso: " + pedido.getId());
    }    
}
