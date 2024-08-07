import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Figura> figuras = new ArrayList<>();

        System.out.print("Quantas figuras você deseja inserir? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Figura " + (i + 1) + ":");
            System.out.print("Tipo de figura (quadrado ou retangulo): ");
            String tipo = scanner.next().toLowerCase();

            if (tipo.equals("quadrado")) {
                System.out.print("Lado: ");
                double lado = scanner.nextDouble();
                figuras.add(new quadrado(lado));
            } else if (tipo.equals("retangulo")) {
                System.out.print("Largura: ");
                double largura = scanner.nextDouble();
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                figuras.add(new Retangulo(largura, altura));
            } else {
                System.out.println("Tipo de figura desconhecido.");
                i--; // Decrementa o índice para tentar novamente
            }
        }

        // Exibir as áreas
        System.out.println("Áreas das figuras:");
        for (Figura figura : figuras) {
            System.out.println(figura.calcularArea());
        }

        scanner.close();
    }
}
