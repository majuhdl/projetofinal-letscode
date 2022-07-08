
public class Aplicacao {

	public static void main(String[] args) {
		System.out.println("Ambiente de teste");

		PessoaFisica cliente1 = new PessoaFisica();
		cliente1.setNome("Samuel Castro Borges");
		cliente1.setCpf("12345678911");

		PessoaJuridica cliente2 = new PessoaJuridica();
		cliente2.setNome("Super Pizzaria");
		cliente2.setCnpj("45678912311");
		
		ContaCorrente conta1 = new ContaCorrente();
		conta1.setSaldo(0);
		conta1.setDonoConta(cliente1);
	}

}
