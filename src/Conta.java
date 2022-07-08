public abstract class Conta {
	private double saldo;
	private Cliente donoConta;
	
	public Conta(double saldo, Cliente donoConta) {
		this.saldo = saldo;
		this.donoConta = donoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setDonoConta(Cliente cliente) {
		this.donoConta = cliente;
	}
	
	public Cliente getDonoConta () {
		return this.donoConta;
	}


}
