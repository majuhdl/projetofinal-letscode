public abstract class Conta {
	private double saldo;
	private Cliente donoConta;

	public Conta(double saldo, Cliente donoConta) {
		this.saldo = saldo;
		this.donoConta = donoConta;
	}

	public double getSaldo() { // FUNCIONALIDADE CONSULTAR SALDO
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setDonoConta(Cliente cliente) {
		this.donoConta = cliente;
	}

	public Cliente getDonoConta() {
		return this.donoConta;
	}

	public void depositarValor(double deposito) {
		if (deposito < 0) {
			throw new ArithmeticException("Opera��o inv�lida - n�o � poss�vel depositar valor negativo");
		}
		this.setSaldo(this.getSaldo() + deposito);
	}

	
	public void sacarValor(double saque) {
		if (saque < 0) {
			throw new ArithmeticException("Opera��o inv�lida - n�o � poss�vel sacar valor negativo");
		}
		if (saque > this.getSaldo()) {
			throw new ArithmeticException("Opera��o inv�lida - saldo insuficiente para o saque solicitado");
		}
		this.setSaldo(this.getSaldo() - saque);
	}

	public void transferir(Conta contaDestino, double valorTransferencia) {
		if (valorTransferencia < 0) {
			throw new ArithmeticException("Opera��o inv�lida - n�o � poss�vel transferir valor negativo");
		}
		if (valorTransferencia > this.getSaldo()) {
			throw new ArithmeticException("Opera��o inv�lida - saldo insuficiente para a transfer�ncia solicitada");
		}

		// this.setSaldo(this.getSaldo()-valorTransferencia);
		// contaDestino.setSaldo(contaDestino.getSaldo()+valorTransferencia);

		this.sacarValor(valorTransferencia);
		contaDestino.depositarValor(valorTransferencia);
	}

}
