
public class ContaPoupanca extends Conta{
 
  public ContaPoupanca(double saldo) {
    super(saldo);
}
  
  public void depositarValor(double valor) {
    System.out.println("você depositou R$ "+ valor);
    valor += this.getSaldo();
    this.setSaldo(valor);
}
  
  public void sacarValor(double valor) {
    double temp = this.getSaldo() - valor;
    this.setSaldo(temp);
    System.out.println("você acabou de sacar R$"+ valor + " seu saldo é: " + temp);
}
  
  public void verificarSaldo() {
    System.out.println("Saldo: "+ this.getSaldo());
}
  
  public void aplicarTaxa(double taxa) {
    double saldoFinal = this.getSaldo() + (this.getSaldo()*taxa);
    this.setSaldo(saldoFinal);
    System.out.println("você adicionou uma taxa de: "+(taxa*100)+"%, seu saldo final é: "+ this.getSaldo());
}
}