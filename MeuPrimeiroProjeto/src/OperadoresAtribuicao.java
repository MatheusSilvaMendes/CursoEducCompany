
public class OperadoresAtribuicao {

	public static void main (String[] args) {
		
		int valor;
		
		System.out.println("--------------- SOMA ---------------");
		
		
		
		valor = 1;
		System.out.println("valor � " + valor);
		
		valor = 2;
		System.out.println("A nova atribui��o de valor � " + valor);
		
		valor = valor + 1;
		System.out.println("valor = valor + 1 resulta em " + valor);
		
		valor = 1;
		System.out.println("A nova atribui��o de valor � "  + valor);
		
		valor += 1;
		System.out.println("valor += resulta em " + valor);
		
		valor = 1;
		valor++;
		System.out.println("valor++ resulta em " + valor);
		
		
		
		System.out.println();
		
		System.out.println("--------------- SUBTRA��O ---------------");
		valor = 2;
		System.out.println("valor � " + valor);
		
		valor = 1;
		System.out.println("A nova atribui��o de valor � " + valor);
		
		valor = valor - 1;
		System.out.println("valor = valor 1 resulta em " + valor);
		
		valor = 2;
		System.out.println("A nova atribui��o de valor � " + valor);
		
		valor -= 1;
		System.out.println("valor += resulta em " + valor);
		
		valor = 2;
		System.out.println("A nova atribui��o de valor � " + valor);
		
		valor--;
		System.out.println("valor-- resulta em " + valor);
		
	}
	
}
