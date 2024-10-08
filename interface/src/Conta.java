
public abstract class Conta implements OperacaoConta {
	
    private double saldo = 0;
    
    public Conta(double saldo) {
     this.saldo = saldo;
    }
    
    public void verificarSaldo() {
     System.out.println("Saldo R$ " + saldo);
    }
    
    public double getSaldo() {
     return this.saldo;
    }
    
    public void setSaldo(double saldo) {
     this.saldo = saldo;
    }
}
