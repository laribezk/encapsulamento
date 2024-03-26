package ds;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
	
	
		imc nome1 = new imc ();
		nome1.setNome("Gustavo Verissimo Santana");
		System.out.println("Nome: " +nome1.getNome());
	    
	   
	    nome1.setIdade(16);
	    System.out.println("idade:"+nome1.getIdade());
	    
	    
	    nome1.setPeso(63);
	    System.out.println("Peso:"+nome1.getPeso());
	    
	    
	    nome1.setAltura(180);
	    System.out.println("Altura:"+nome1.getAltura());
	    
	   
	    System.out.println("Imc: " +nome1.getImc());
		}

}
