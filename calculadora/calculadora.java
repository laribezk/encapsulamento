package calculadora;
import java.util.List;
public class calculadora {
	 private String nome;
	    private double resultado;
	    
	  
	    public String getNome() {
	        return nome;
	    }
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    public double getResultado() {
	        return resultado;
	    }
	    public void setResultado(double resultado) {
	        this.resultado = resultado;
	    }

	   public void soma(int n1, int n2) {
	        resultado = n1 + n2;
	    }
	    public void soma(double n1, double n2){
	        resultado = n1 + n2;
	    }

	    public void subtracao(int n1, int n2){
	        resultado = n1 - n2;
	    }
	    public void subtracao(double n1, double n2){
	        resultado = n1 - n2;
	    }

	     public void soma(List<Double> numeros) {
	        resultado = 0;
	        for (Double num : numeros) {
	            resultado += num;
	        }
	    }

	    public void subtracao(List<Double> numeros) {
	        if ( ! numeros.isEmpty() ) {
	            resultado = numeros.get(0);
	            for (int i = 1; i < numeros.size(); i++) {
	                resultado -= numeros.get(i);
	            }
	        }
	    }


	}

