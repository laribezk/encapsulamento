package dss;

public class JogoEletronico extends Jogo {

        private String plataforma;
        private String genero;

        public String getPlataforma() {
                return plataforma;
        }

        public void setPlataforma(String plataforma) {
                this.plataforma = plataforma;
        }

        public String getGenero() {
                return genero;
        }

        public void setGenero(String genero) {
                this.genero = genero;
        }

        public void jogarOnline(int quantidadeJogadores) {
                System.out.println("o total de jogadores online são de : " + quantidadeJogadores);
        }

        @Override
        public void exibirInformacoes() {
                super.exibirInformacoes();
                System.out.println("plataforma: " + this.plataforma);
                System.out.println("gênero: " + this.genero);
        }
}

