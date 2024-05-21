package ds;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Cliente  c1 = new Cliente() ;
			 c1.setnome("jude");
			 c1.setidade(16);
			 c1.setendereco("Itaquera");
			 c1.setvalor_pedido(190);
			 c1.setvalor_promocional("10%");
			 
        ClientePremium c2 = new ClientePremium();
             c2.setnome("Cardan");
             c2.setidade(18);
             c2.setendereco("Tatuape");
             c2.setvalor_pedido(300);
             c2.setvalor_promocional("15%");
            
            c1.informacoes();
            System.out.println("");
            c2.informacoes();
	}

}
