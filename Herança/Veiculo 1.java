package ds;

public class Veiculo {

	private String modelo;
	private int ano;
	private String cor;
	private String marca;
	
	
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public String getmodelo() {
		return modelo;
	}
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	public int getano() {
		return ano;
	}
	public void setano(int ano) {
		this.ano = ano;
	}
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor = cor;
	}
	
	public void informacoes () {
		System.out.println("A marca da moto é " +marca);
		System.out.println("O modelo é " +modelo);
		System.out.println("O ano da moto é de " +ano);
		System.out.println("A cor da moto é " +cor);
	
	}
	

}
