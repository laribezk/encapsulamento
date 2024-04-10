package ds;

public class Main {

	public static void main(String[] args) {
		
		
		Filmes filme01 = new Filmes();
		
		filme01.setTituloFilme("Os Vingadores");
		filme01.setDuracaoemMinutos(142);
		filme01.exibirDuracaoEmHoras();
		
		System.out.println("A duração do filme " +filme01.getTituloFilme()+ "em horas é: "+filme01.exibirDuracaoEmHoras());
		
	
		
		Filmes filme02 = new Filmes();
		
		filme02.setTituloFilme("Hotel Transilvânia");
		filme02.setDuracaoemMinutos(92);
		filme02.exibirDuracaoEmHoras();
		
		System.out.println("\nA duração do filme "+filme02.getTituloFilme()+" em horas é: "+filme02.exibirDuracaoEmHoras());
		
	
		Filmes filme03 = new Filmes();
		
		filme03.setTituloFilme("Homem de Ferro 1");
		filme03.setDuracaoemMinutos(126);
		filme03.exibirDuracaoEmHoras();
		
		System.out.println("\nA duração do filme "+filme03.getTituloFilme()+" em horas é: "+filme03.exibirDuracaoEmHoras());
		
		
        Filmes filme04 = new Filmes();
        
        filme04.setTituloFilme("Homem de Ferro 2");
        filme04.setDuracaoemMinutos( 127);
		filme04.exibirDuracaoEmHoras();
		System.out.println("\nA duração do filme "+filme04.getTituloFilme()+" em horas é: "+filme04.exibirDuracaoEmHoras());
		
		
		
		Filmes filme05 = new Filmes();
		
		filme05.setTituloFilme("Homem de Ferro 3");
		filme05.setDuracaoemMinutos(130);
		filme05.exibirDuracaoEmHoras();
		
		System.out.println("\nA duração do filme "+filme05.getTituloFilme()+" em horas é: "+filme05.exibirDuracaoEmHoras());
		
		System.out.println("\nOs filmes em cartaz são: "+filme01.getTituloFilme()+" , "+filme02.getTituloFilme()+ " , " +filme03.getTituloFilme()+ " , " +filme04.getTituloFilme()+ " e " +filme05.getTituloFilme());
		
	}
}