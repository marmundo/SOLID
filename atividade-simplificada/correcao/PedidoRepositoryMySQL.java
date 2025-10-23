package correcao;

public class PedidoRepositoryMySQL implements PedidoRepositorio {
    @Override
    public void salvar(Pedido pedido) {
        // Lógica para salvar o pedido no banco de dados MySQL
        System.out.println("Pedido salvo no banco de dados MySQL: " + pedido.getId());
    }
    
}
