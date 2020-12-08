package solid.to.refactor.lsp.corrigido;

public class ContaDeEstudante implements Comum {
	
	private int milhas;
	
	@Override
	public void deposita(double valor) {
		this.milhas += (int)valor;
		super.deposita(valor);
	}
	
	public int getMilhas() {
		return milhas;
	}	
	
}
