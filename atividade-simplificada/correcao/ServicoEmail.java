package correcao;

public class ServicoEmail implements ServicoNotificacao {
    @Override
    public void enviarEmailConfirmacao(Pedido pedido) {
        // Lógica para enviar email de confirmação
        System.out.println("Email de confirmação enviado para o pedido: " + pedido.getId());
    }
    
}
