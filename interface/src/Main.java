import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	ContaCorrente cC = new ContaCorrente (720,200);
    	
    	cC.verificarSaldo();
    	
    	cC.depositarValor(250);
    	
    	cC.verificarSaldo();
    	
    	cC.sacarValor(555);
    	
    	cC.verificarSaldo();
    	
    	cC.sacarValor(1000);
    	
    	cC.verificarSaldo();
    	
    	ContaPoupanca cP = new ContaPoupanca (999);
    	
    	cP.verificarSaldo();
    	
    	cP.depositarValor(44);
    	
    	cP.verificarSaldo();
    	
    	cP.sacarValor(90);
    	
    	cP.aplicarTaxa(0.20);
    	
    	cP.verificarSaldo();
    	}}