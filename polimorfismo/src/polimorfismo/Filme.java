package polimorfismo;

public class Filme extends Conteudo {

	    private Integer duracao;

	    public Filme(String categoria, String titulo, int duracao) {
	        super(categoria, titulo);
	        this.duracao = duracao;
	    }

	    public int getduracao() {
	        return duracao;
	    }

	    public void setduracao(int duracao) {
	        this.duracao = duracao;
	    }

	    @Override
	    public String descricao() {
	        return "Filme:" + "Titulo: " + gettitulo() + "Categoria: " + getcategoria() + "duracao: " + duracao + " Minutos";
	    }

	}

