package calculadora;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
        int  soma = 1, subtracao = 2, operacao;
   
        calculadora calc = new calculadora();

        System.out.println("Qual operação você deseja realizar, digite 1 para soma e 2 para subtração: ");
        operacao = in.nextInt();

        if (operacao <= soma) {
            calc.soma(7, 8);
            System.out.println("Soma de inteiros: " + calc.getResultado());
            calc.soma(6.9, 9.7);
            System.out.println("Soma de decimais: " + calc.getResultado());

        } else {
            calc.subtracao(9, 6);
            System.out.println("Subtração de inteiros: " + calc.getResultado());
            calc.subtracao(11.8, 3.5);
            System.out.println("Subtração de decimais: " + calc.getResultado());
        }
        
        
    }
}

	

