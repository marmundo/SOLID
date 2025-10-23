class ProcessadorDePedidos {
    private Calcular calc = new Calcular();
    private SalvarBD banco = new SalvarBD(); 
    private EnviarEmail email = new EnviarEmail(); 

    public void processar(Pedido pedido) {
        calc.Calcular(pedido); 
        pedido.getTipoPagamento().pagamento(pedido);
        banco.salvar(pedido); 
        email.print(); 
    }
}