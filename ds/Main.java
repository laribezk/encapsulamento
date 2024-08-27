package ds;

public class Main {
	
	    public static void main(String[] args) {
	       
	        Carro carro1 = new Carro("Fusca", 20000, "Azul", "Gasolina");
	        Carro carro2 = new Carro("Civic", 90000, "Preto", "Etanol");

	      
	        Moto moto1 = new Moto("Hornet", 15000, "Vermelha", "Alcool");
	        Moto moto2 = new Moto("CBR 1000", 50000, "Branca", "Gasolina");

	      
	        carro1.imprimirFicha();
	        carro2.imprimirFicha();
	        moto1.imprimirFicha();
	        moto2.imprimirFicha();
	    }
	}


