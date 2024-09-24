package polimorfismo;


public class Serie extends Conteudo{
    private Integer duracao;
    private Integer quantEpisodios;
    private Integer quantTemps;

    public Serie(String categoria, String titulo, Integer duracao, Integer quantEpisodios, Integer quantTemps) {
        super(categoria, titulo);
        this.duracao = duracao;
        this.quantEpisodios = quantEpisodios;
        this.quantTemps = quantTemps;
    }

    public Integer getduracao() {
        return duracao;
    }

    public void setduracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getquantEpisodios() {
        return quantEpisodios;
    }

    public void setquantEpisodios(Integer quantEpisodios) {
        this.quantEpisodios = quantEpisodios;
    }

    public Integer getquantTemps() {
        return quantTemps;
    }

    public void setquantTemps(Integer quantTemps) {
        this.quantTemps = quantTemps;
    }

    @Override
    public String descricao() {
        return "Serie:" + "Titulo: " + gettitulo() + "Categoria: " + getcategoria()  + "Duracao: " + duracao + " Minutos Episódio" + "Quantidade Episodios: " + quantEpisodios  + "Quantidade Temporadas: " + quantTemps;
    }

}
