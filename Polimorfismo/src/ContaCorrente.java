public class ContaCorrente extends Conta{
	
	private double tarifaMensal = 12.5;
	
	public ContaCorrente(String Nome, String CPF, String numeroConta, double saldo) {
		super(Nome, CPF, numeroConta, saldo);
	}
	
	public void setTarifaMensa(double TarifaMensal) {
		tarifaMensal = TarifaMensal;
	}
	
}