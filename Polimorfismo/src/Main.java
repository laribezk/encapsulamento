import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Conta conta = new Conta("Larissa", "248.963.152-10", "O27", 3852);
		ContaCorrente corrente = new ContaCorrente("Larissa", "248.963.152-10", "O27", 9635);
		ContaPoupanca Poupanca = new ContaPoupanca("Larissa", "248.963.152-10", "O27", 1253);
		Lucros lucro = new Lucros(0);
		
		
		System.out.print(" DIGITE (saque) PARA SACAR |  DIGITE (deposito) PARA  DEPOSITAR: ");
		String opcao = in.next();
		
		if(opcao.equalsIgnoreCase("saque")) {
			System.out.println("Valor do saque: ");
			double quantia = in.nextDouble();
			conta.sacar(quantia);
			
		} else if(opcao.equalsIgnoreCase("deposito")) {
			System.out.println("Valor do deposito: ");
			double quantia = in.nextDouble();
			conta.depositar(quantia);
		}
		
		conta.imprimir();
		Poupanca.atualizarSaldo();
		Poupanca.imprimir();
		corrente.imprimir();
		lucro.registra(Poupanca);
		
	}
}