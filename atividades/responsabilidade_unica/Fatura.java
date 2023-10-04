
public class Fatura {
	
	private String dataVencimento;
	private String valor;
	private boolean estaPago;
	
	public Fatura() {
		
	}
	
	public Fatura(String dataVencimento, String valor, boolean estaPago) {
		this.dataVencimento = dataVencimento;
		this.valor = valor;
		this.estaPago = estaPago;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public boolean isEstaPago() {
		return estaPago;
	}
	public void setEstaPago(boolean estaPago) {
		this.estaPago = estaPago;
	}
}
