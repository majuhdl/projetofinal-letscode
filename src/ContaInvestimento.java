
public class ContaInvestimento extends Conta implements Rentavel {

	public void renderConta() {

		double rendimento = 0.01;
		boolean isPessoaJuridica =  getDonoConta() instanceof PessoaJuridica;
		if (isPessoaJuridica) {
			rendimento+= 0.02;
		}
		setSaldo(getSaldo() + getSaldo() * rendimento);
	}

}
