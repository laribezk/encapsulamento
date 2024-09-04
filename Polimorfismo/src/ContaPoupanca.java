public class ContaPoupanca extends Conta{
	
	private double percentualRend = 0.01;
	
	public ContaPoupanca(String Nome, String CPF, String numeroConta, double saldo) {
		super(Nome, CPF, numeroConta, saldo);
	}
	
	public void atualizarSaldo() {
		double resultado = 0;
		resultado = (super.getSaldo() * percentualRend ) + super.getSaldo();
		super.setSaldo(resultado);
	}
}