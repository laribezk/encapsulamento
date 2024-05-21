package ds;

public class Cliente {
   private String nome;
   private int idade;
   private String endereco;
   private int valor_pedido;
   private String valor_promocional;
   
   public String getnome() {
	   return nome;
   }
   
   public void setnome(String nome) {
	   this.nome = nome;
   }
   
   public int getidade() {
	   return idade;
   }
   
   public void setidade(int idade) {
	   this.idade = idade;
	   
   }
   
   public String getendereco() {
	   return endereco;
   }
   
   public void setendereco(String endereco) {
	  this.endereco = endereco;
   }
  
   public int getvalor_pedido() {
	   return valor_pedido;
   }
   
   public void setvalor_pedido( int valor_pedido) {
	   this.valor_pedido = valor_pedido;
   }
   
   public String getvalor_promocional() {
	   return valor_promocional;
   } 
   
   public void setvalor_promocional(String valor_promocional) {
	   this.valor_promocional = valor_promocional;
   }
   
   public double calcular_desconto() {
     return valor_pedido * 0.10;
   }
   
   public void informacoes() {
     System.out.println("Nome: " +nome);
     System.out.println("Idade: " +idade);
     System.out.println("Endereço: " +endereco);
     System.out.println("Valor do Pedido: " +valor_pedido);
     System.out.println("Valor Promocional: " +valor_promocional);
     System.out.println("Valor do Pedido com Desconto: " +calcular_desconto());
   }
}

