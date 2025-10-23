public class Cartao implements TipoPagamento{
    public void pagamento(Pedido pedido){
        System.out.println("Processando pagamento via Cartão de Crédito...");
    }
}