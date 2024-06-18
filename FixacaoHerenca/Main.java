package dss;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);

        JogoEletronico j1 = new JogoEletronico();
        j1.setNome("Fortnite");
        j1.setPreco(144);
        j1.setDistribuidora("Epic Games");
        j1.setPlataforma("xbox");
        j1.setGenero("Battle Royale");

        System.out.println("informações do jogo eletrônico:");
        j1.exibirInformacoes();
        j1.jogarOnline(4);


        JogoFisico j2 = new JogoFisico();
        j2.setNome("perfil 7");
        j2.setPreco(76.99);
        j2.setDistribuidora("grow");
        j2.setQuantidadeJogadores(6);
        j2.setTempoPartida(30);

        System.out.println("\ninformações do jogo físico:");
        j2.exibirInformacoes();

        int tempoTotal = j2.calcularTempoTotal(5);
        System.out.println("o tempo total de jogo para 5 partidas é de: " + tempoTotal + " minutos");

        System.out.println("-------------------------------------");
        System.out.println("agora é a sua vez");
        System.out.println();

        JogoEletronico j3 = new JogoEletronico();

        System.out.println("digite as informações do jogo eletrônico:");
        System.out.print("nome: ");
        j3.setNome(in.nextLine());

        System.out.print("preço: ");
        j3.setPreco(in.nextDouble());
        in.nextLine();

        System.out.print("distribuidora: ");
        j3.setDistribuidora(in.nextLine());

        System.out.print("plataforma: ");
        j3.setPlataforma(in.nextLine());

        System.out.print("gênero: ");
        j3.setGenero(in.nextLine());

        System.out.print("quantidade de jogadores online: ");
        int quantidadeJogadoresOnline = in.nextInt();
        in.nextLine();

        System.out.println("\ninformações do jogo eletrônico:");
        j3.exibirInformacoes();
        j3.jogarOnline(quantidadeJogadoresOnline);

        System.out.println("-------------------------------------");

        JogoFisico j4 = new JogoFisico();
        System.out.print("nome: ");
        j4.setNome(in.nextLine());

        System.out.print("preço: ");
        j4.setPreco(in.nextDouble());
        in.nextLine();

        System.out.print("distribuidora: ");
        j4.setDistribuidora(in.nextLine());

        System.out.print("quantidade jogadores: ");
        j4.setQuantidadeJogadores(in.nextInt());

        System.out.print("tempo da partida: ");
        j4.setTempoPartida(in.nextInt());
        System.out.print("quantidade de partidas: ");
        int quantidadePartidas = in.nextInt();

        System.out.println("\ninformações do jogo físico:");
        j4.exibirInformacoes();

        tempoTotal = j4.calcularTempoTotal(quantidadePartidas);
        System.out.println("o tempo total de jogo para " + quantidadePartidas + " partidas é de " + tempoTotal + " minutos");

    }
}
