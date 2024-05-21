package ds;

public class ClientePremium extends Cliente {
	
	  public double calcular_desconto() {
		  return super.getvalor_pedido() * 0.15;
	  }
	  
	  public void informacoes () {
		  super.informacoes();
		  } 
}
