
public class Cliente {
    private String nome;
    private String email;
    private String endereco;
    private Fatura fatura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
}
