package prova;

public class Publicacao {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Publicacao() {
    }
    
    public String gettitulo() {
    	return this.titulo ;
    }
    
    public void settitulo(String titulo) {
    	this.titulo = titulo;
    }
    
    public String getautor() {
    	return this.autor ;
    }
    
    
    public void setautor(String autor) {
    	this.autor =autor;
    }
    
    public int getanoPublicacao() {
    	return this.anoPublicacao;
    }
    
    
    public void setanoPublicacao(int anoPublicacao) {
    	this.anoPublicacao = anoPublicacao;
    }
    
    
    public void exibirDetalhes() {
    	
    	System.out.println("titulo: " +titulo);
    	System.out.println("autor: " +autor);
    	System.out.println("ano publicação: " +anoPublicacao);
    }
}
