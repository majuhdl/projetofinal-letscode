
public class Aplicacao {

	public static void main(String[] args) {
		System.out.println("Ambiente de teste");

		PessoaFisica cliente1 = new PessoaFisica();
		cliente1.setNome("Samuel Castro Borges");
		cliente1.setCpf("12345678911");

		PessoaJuridica cliente2 = new PessoaJuridica();
		cliente2.setNome("Super Pizzaria");
		cliente2.setCnpj("45678912311");
		
		ContaCorrente conta1 = new ContaCorrente(0, cliente1);
		System.out.println("Saldo de conta PF:"+conta1.getSaldo()+"\nNome cliente:"+conta1.getDonoConta().getNome());
		conta1.depositarValor(100);
		System.out.println("Saldo pos deposito de 100:"+conta1.getSaldo()+"\nNome cliente:"+conta1.getDonoConta().getNome());
		conta1.sacarValor(100);
		System.out.println("Saldo pos saque de 100:"+conta1.getSaldo()+"\nNome cliente:"+conta1.getDonoConta().getNome()+"\n");

		ContaCorrente conta2 = new ContaCorrente(0, cliente2);
		System.out.println("Saldo de conta PJ:"+conta2.getSaldo()+"\nNome cliente:"+conta2.getDonoConta().getNome());
		conta2.depositarValor(100);
		System.out.println("Saldo apos deposito de 100:"+conta2.getSaldo()+"\nNome cliente:"+conta2.getDonoConta().getNome());
		conta2.sacarValor(10);
		System.out.println("Saldo após saque de 10:"+conta2.getSaldo()+"\nNome cliente:"+conta2.getDonoConta().getNome());
		conta2.transferir(conta1, 10);
		System.out.println("Saldo Conta 1 apos transferencia de 10:"+conta1.getSaldo()+"\nNome cliente:"+conta1.getDonoConta().getNome());
		System.out.println("Saldo Conta 2apos tranferencia de 10:"+conta2.getSaldo()+"\nNome cliente:"+conta2.getDonoConta().getNome()+"\n");

		//ContaInvestimento conta10 = new ContaPoupanca(0, cliente2);
		
		ContaPoupanca conta3 = new ContaPoupanca(0, cliente1);
		conta3.depositarValor(550);
		conta3.sacarValor(220);
		System.out.println("Saldo:"+conta3.getSaldo()+"\nNome cliente:"+conta3.getDonoConta().getNome());

		ContaInvestimento conta4 = new ContaInvestimento(0, cliente1);
		conta3.transferir(conta4, 13.50);
		System.out.println("Saldo:"+conta3.getSaldo()+"\nNome cliente:"+conta3.getDonoConta().getNome());
		System.out.println("Saldo:"+conta4.getSaldo()+"\nNome cliente:"+conta4.getDonoConta().getNome());

		ContaInvestimento conta5 = new ContaInvestimento(0, cliente2);
		System.out.println("Saldo:"+conta5.getSaldo()+"\nNome cliente:"+conta5.getDonoConta().getNome());
		
		conta3.renderConta();
		System.out.println("Saldo:"+conta3.getSaldo()+"\nNome cliente:"+conta3.getDonoConta().getNome());
	}

}
