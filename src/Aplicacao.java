
public class Aplicacao {

	public static void main(String[] args) {
		System.out.println("Ambiente de teste");

		PessoaFisica cliente1 = new PessoaFisica();
		cliente1.setNome("Samuel Castro Borges");
		cliente1.setCpf("12345678911");

		PessoaJuridica cliente2 = new PessoaJuridica();
		cliente2.setNome("Super Pizzaria");
		cliente2.setCnpj("45678912311");

	}

}
