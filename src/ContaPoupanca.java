public class ContaPoupanca extends Conta implements Rentavel {

	public ContaPoupanca(double saldo, PessoaFisica donoConta) {
		super(saldo, donoConta);
	}

	@Override
	public void renderConta() {
		double rendimento = 0.005;
		setSaldo(getSaldo() + getSaldo() * rendimento);

	}

}
