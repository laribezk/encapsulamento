package ds;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Carro c1 = new Carro();
		
		        c1.setmarca("honda");

				c1.setcor("preto");

				c1.setmodelo("civic");

				c1.setano(2020);

				c1.setQuantidadePortas(4);

				Moto m1 = new Moto();

				m1.setmarca("yamaha");

				m1.setcor("vermelho");

				m1.setmodelo("mt-07");

				m1.setano(2010);

				m1.setcilindrada(300);

				
				c1.informacoes();
				System.out.println("");
				m1.informacoes();
				
	}

}
