package dss;

	public class Jogo {

        private String nome;
        private double preco;
        private String distribuidora;

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public double getPreco() {
                return preco;
        }

        public void setPreco(double preco) {
                this.preco = preco;
        }

        public String getDistribuidora() {
                return distribuidora;
        }

        public void setDistribuidora(String distribuidora) {
                this.distribuidora = distribuidora;
        }

        public void exibirInformacoes() {
                System.out.println("nome: " + this.nome);
                System.out.println("preço: " + this.preco);
                System.out.println("distribuidora: " + this.distribuidora);
        }


}

