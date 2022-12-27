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
				"O resultado da modulo é {0} \n" + 
				"O resultado da subtracao é {1} \n" +
				"O resultado da divisao é {2} \n" +
				"O resultado da divisao2 decimal é {3} \n" +
				"O resultado da multiplicacao é {4} \n" +
				"O modulo de 7 % 3 é {5}",
				soma, subtracao, divisao, divisao2, multiplicacao, modulo);
		
		System.out.println(resposta);
	}
	
	
}
