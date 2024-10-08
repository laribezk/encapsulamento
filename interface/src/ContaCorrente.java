
public class ContaCorrente extends Conta{
	
  private double limiteEspecial;
  
  public ContaCorrente(double saldo, double limiteEspecial) {
    super(saldo);
     this.limiteEspecial = limiteEspecial;
  }
  
  public void depositarValor(double valor) {
    System.out.println("Você depositou R$ "+ valor);
     valor += this.getSaldo();
     this.setSaldo(valor);
  }
  
  public void sacarValor(double valor) {
    if (this.getSaldo() - valor >= -limiteEspecial) {
        double temp = this.getSaldo() - valor;
        this.setSaldo(temp);
        System.out.println("Você sacou R$ " + valor + " seu saldo atual é de: " + temp);
    } else {
      
        double valorPermitido = this.getSaldo() + limiteEspecial;
        this.setSaldo(-limiteEspecial); 
        System.out.println("Você tentou sacar R$ " + valor + ", porem só é permitido sacar R$ " + valorPermitido + ". No momento seu Saldo é de:  " + this.getSaldo());
    }
}
 
  public void verificarSaldo() {
    System.out.println("saldo : "+ this.getSaldo());
 }
}