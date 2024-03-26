package ds;

public class imc {
    private  String nome;
    private  int idade;
    private  double peso;
    private double altura;
    private double Imc;
      
    public String getNome() {
    	return this.nome;
    }
    
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public int getIdade() {
    	return idade;
    }
    
    
    public void setIdade(int idade) {
    	this.idade = idade;
    }
    
    public double getPeso() {
    	return peso;
    }
    
    public void setPeso(double peso) {
    	this.peso = peso;
    }
    
    public double getAltura() {
    	return altura;
    }
    
    public void setAltura(double altura) {
    	this.altura = altura;
    }
    
    public double getImc() {
    	return Imc;
    }
    
    
     void setCalcularImc  () {
    	 Imc = peso/(altura*altura);
    	
     }
     
     String classsificarImc  () {
    	 
     
     if(Imc<18.5) {
			return  ("você esta abaixo do peso");
			
		} else if (Imc >=18.5 && Imc<=24.9) {
			return  ("você esta no peso normal");
			
		} else if (Imc >=25 && Imc<=29.9) {
			return  ("você esta Sobrepeso");
		} else if (Imc>=30 && Imc<=34.9) {
			return  ("você esta na obesidade de grau 1");
		} else if (Imc>=35 && Imc<=39.9) {
			return  ("você esta na obesidade de grau 2");
		} else if (Imc >= 40){
			return  ("você esta na obesidade de grau 3");
		}
     
		 return("nao foi possivel calcular");
        
     
}
     }