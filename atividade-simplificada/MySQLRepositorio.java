// Implementação concreta de Repositório (Acoplamento)
class MySQLRepositorio implements SalvarBD {
    public void salvar(Pedido pedido) {
        System.out.println("Salvando o pedido no banco de dados MySQL...");
    }
}