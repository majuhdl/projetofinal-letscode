
public class ContaPoupanca extends Conta implements Rentavel {

	@Override
	public void renderConta() {
		double rendimento = 0.005;
		setSaldo(getSaldo() + getSaldo() * rendimento);

	}

}
