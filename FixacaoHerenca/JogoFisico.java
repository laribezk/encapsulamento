package dss;

public class JogoFisico extends Jogo {

        private int quantidadeJogadores;
        private int tempoPartida;

        public int getQuantidadeJogadores() {
                return quantidadeJogadores;
        }

        public void setQuantidadeJogadores(int quantidadeJogadores) {
                this.quantidadeJogadores = quantidadeJogadores;
        }

        public int getTempoPartida() {
                return tempoPartida;
        }

        public void setTempoPartida(int tempoPartida) {
                this.tempoPartida = tempoPartida;
        }

        public int calcularTempoTotal(int quantidadePartidas) {
                int tempoTotal = quantidadePartidas * this.tempoPartida;
                return tempoTotal;
        }

        @Override
        public void exibirInformacoes() {
                super.exibirInformacoes();
                System.out.println("quantidade de jogadores: " + this.quantidadeJogadores);
                System.out.println("tempo partida: " + this.tempoPartida);
        }

}

