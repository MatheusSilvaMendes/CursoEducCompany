
public class OperadoresRelacionais {

	public static void main(String[] args) {
	
		int valor;
		int novoValor;
		
		boolean isMaior = false;
		boolean isMenor = false;
		boolean isIgual = false;
		boolean isDiferente = false;
		
		System.out.println("------------- VALORES -------------");
		
		valor = 1;
		System.out.println("Valor = " + valor);
		novoValor = valor+1;
		System.out.println("Novo Valor = " + novoValor);
		
		System.out.println("");
		
		System.out.println("------------- � MAIOR? -------------");
		isMaior = (valor > novoValor);
		System.out.println("Valor � MAIOR que Novo valor? >>>> " + isMaior);
		isMaior = (novoValor > valor);
		System.out.println("Novo Valor � MAIOR que novo valor? >>>>" + isMaior);
		
		System.out.println("");
		
		System.out.println("------------- � MENOR? -------------");
		isMenor = (valor < novoValor);
		System.out.println("Valor � MENOR que Novo valor? >>>>" + isMenor);
		isMenor = (novoValor < valor);
		System.out.println("Novo Valor � MENOR que valor? >>>>" + isMenor);
		

		System.out.println("");
		
		System.out.println("------------- � IGUAL? -------------");
		isIgual = (valor == novoValor);
		System.out.println("Valor � IGUAL que Novo valor? >>>>" + isIgual);
		
		
		System.out.println("");
		
		System.out.println("------------- � DIFERENTE? -------------");
		isDiferente = (valor != novoValor);
		System.out.println("Valor � DIFERENTE que Novo valor? >>>>" + isDiferente);
		
	}
	
}
	