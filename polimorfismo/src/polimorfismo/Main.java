package polimorfismo;

import polimorfismo.Conteudo;
import polimorfismo.Filme;
import polimorfismo.Serie;

import java.util.ArrayList;
import java.util.List;
public class Main {
	
	    public static void main(String[] args) {
	        List<Conteudo> catalogo = new ArrayList<>();

	        catalogo.add(new Filme("Ação", " Avatar ", 162));
	        catalogo.add(new Filme("Ação", "Vingadores: Ultimato ", 180));
	        catalogo.add(new Filme("Ficção Cientifica", "Avatar: O Caminho da Água", 192));
	        catalogo.add(new Filme("Animação", "Divertida Mente 2 ", 96));
	        catalogo.add(new Filme("Ação", "Jurassic World", 124));

	        catalogo.add(new Serie("Ação", "Dinastia", 40, 108, 4));
	        catalogo.add(new Serie("Drama", "Elite", 50, 64, 8));
	        catalogo.add(new Serie("Comédia", "Sex education", 27, 32, 4));
	        catalogo.add(new Serie("Terror", "Stranger Things", 50, 34, 4));
	        catalogo.add(new Serie("Romance", "HeartStopper",30 , 16, 3));

	        for(Conteudo conteudo : catalogo){
	            System.out.println(conteudo.descricao());
	            System.out.println();
	        }
	    }
	}


