package ds;


public class Carro extends Veiculo {
 
	private int QuantidadePortas;
	
    public void setQuantidadePortas (int QuantidadePortas) {
    	this.QuantidadePortas = QuantidadePortas;
    }
    public int getQuantidadePortas() {
	    return this.QuantidadePortas;
	 
 }
    
    public void informacoes () {
    	
    	super.informacoes();
    	System.out.println("A quantidade de portas é " +QuantidadePortas);
    	
    	
    }
    
    
    
	
}
