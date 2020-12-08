package solid.to.refactor.sip.corrigido;

public abstract class Funcionario {
	
	private Cargo cargo;
	private double salarioBase;

	double calcularSalario();

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
