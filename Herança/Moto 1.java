package ds;

public class Moto extends Veiculo {
	 
	private double cilindrada;
	
	 public void setcilindrada(double cilindrade) {
	    	this.cilindrada = cilindrada;
	    }
	 
	    public double getcilindrada() {
		    return this.cilindrada;
	    }
	    
		    public void informacoes () {
		    	
		    	super.informacoes();
		    	System.out.println("A quantidade de cilindrada é " +cilindrada);
		    	
	 }
}
