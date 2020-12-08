package solid.to.refactor.lsp.corrigido;

public class ContaComum implements Rentavel, Comum{
	
	protected double saldo;
	
	public ContaComum() {
		this.saldo = 0;
	}
	
	@override
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	@override
	public void rende() {
		this.saldo *= 1.1;
	}
}
