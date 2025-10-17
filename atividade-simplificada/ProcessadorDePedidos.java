class ProcessadorDePedidos {
    public void processar(Pedido pedido, SalvarBD banco, EnviarEmail email, Calcular calc) {
        calc.Calcular(pedido); 
        pedido.getTipoPagamento().pagamento();
        banco.salvar(pedido); 
        email.print(); 
    }
}