public class Revista extends Publicacao {
	private int numEdicao;
	private String mesPublicacao;
	
	public Revista() {
	}
	
	public int getnumEdicao() {
		return this.numEdicao;
	}
	
	public void setnumEdicao(int numEdicao) {
		this.numEdicao = numEdicao;
	}
    
	public String getmesPublicacao() {
		return this.mesPublicacao;
	}
	
	public void setmesPublicacao(String mesPublicacao ) {
		this.mesPublicacao = mesPublicacao;
	}
	
	  public void exibirDetalhes () {
		   
	        super.exibirDetalhes();
	    	System.out.println("numero edição: " +numEdicao) ;
	    	System.out.println("mês publicação: " +mesPublicacao);
	    	
	    }
	
        public void exibirDetalhes(boolean incluir){
            if (incluir){
                this.exibirDetalhes();
            }else{
                super.exibirDetalhes();
                System.out.println("Numero edição: " +numEdicao);
            }
        }
}
