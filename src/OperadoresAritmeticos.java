import java.text.MessageFormat;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int soma = 1 + 1;
		int subtracao = 3 - 2;	
		int divisao = 7 / 3;
		double divisao2 = 7.0 / 3.0;
		double multiplicacao = 3.5 * 2;
		int modulo = 7 % 3;
		
		String resposta = MessageFormat.format(
				"O resultado da modulo � {0} \n" + 
				"O resultado da subtracao � {1} \n" +
				"O resultado da divisao � {2} \n" +
				"O resultado da divisao2 decimal � {3} \n" +
				"O resultado da multiplicacao � {4} \n" +
				"O modulo de 7 % 3 � {5}",
				soma, subtracao, divisao, divisao2, multiplicacao, modulo);
		
		System.out.println(resposta);
	}
	
	
}
