public class Livro extends Publicacao {
	
	private int numPaginas;
	private String editora;
	
	public Livro () {
	}
	public int getnumePaginas() {
		return this.numPaginas;
	}
	
	public void setnumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public String  geteditora() {
		return this.editora;
	}
	
	public void seteditora(String editora) {
		this.editora = editora;
	}
	
   public void exibirDetalhes () {
		  
        super.exibirDetalhes();
    	System.out.println("numero de paginas: " +numPaginas);
    	System.out.println("editora: " +editora);
    }

    public void exibirDetalhes(boolean incluir){
        if (incluir){
           exibirDetalhes();
        }else{
            super.exibirDetalhes();
            System.out.println("Numero paginas: " +numPaginas);
        }
    }
}
