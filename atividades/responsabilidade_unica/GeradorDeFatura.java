public class GeradorDeFatura {

    public void gerarFatura(Fatura fatura) {
        System.out.println("Valor da fatura: " + fatura.getValor());
        System.out.println("Vencimento da fatura: " + fatura.getDataVencimento());
        System.out.println("Situa��o da fatura: " + fatura.isEstaPago());
    }
}