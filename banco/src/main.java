public class main {
  public static void main(String[] args) {
		Cliente mateus = new Cliente();
		mateus.setNome("mateus");
		
		ContaCorrente cc = new ContaCorrente(mateus);
		ContaPoupanca poupanca = new ContaPoupanca(mateus);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
