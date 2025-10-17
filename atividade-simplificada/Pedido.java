// Classe que representa o Pedido
class Pedido {
    private java.util.List<Item> itens = new java.util.ArrayList<>();
    private TipoPagamento tipoPagamento; // "cartao", "boleto"

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public java.util.List<Item> getItens() {
        return itens;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}