
public class Main {

	public static void main(String[] args) {
		Cliente usuario = new Cliente();
		usuario.setNome("fulano");
		usuario.setNomeMae("fulana silva");
		usuario.setSexo('m');
		usuario.setIdade(19);
		
		
		Conta cc = new ContaCorrente(usuario);
		Conta poupanca = new ContaPoupanca(usuario);

		cc.depositar(190);
		cc.transferir(85, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
