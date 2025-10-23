package correcao;

public class ServicoCalculo {
    public double calcularTotal(Pedido pedido) {
       return pedido.getItens().stream()
                .mapToDouble(Item::getPreco)
                .sum();
    }
}
