package polimorfismo;

public abstract class Conteudo {
	

	    private String categoria;
	    private String titulo;

	    public Conteudo(String categoria, String titulo) {
	        this.categoria = categoria;
	        this.titulo = titulo;
	    }

	    public String gettitulo() {
	        return titulo;
	    }

	    public void settitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getcategoria() {
	        return categoria;
	    }

	    public void setcategoria(String categoria) {
	        this.categoria = categoria;
	    }

	    public String descricao() {
	        return "Conteudo: \n\t" +
	                "categoria: " + categoria + "\n" +
	                "\ttitulo: " + titulo;
	    }
}

