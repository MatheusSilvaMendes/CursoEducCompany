
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
		
		System.out.println("------------- É MAIOR? -------------");
		isMaior = (valor > novoValor);
		System.out.println("Valor é MAIOR que Novo valor? >>>> " + isMaior);
		isMaior = (novoValor > valor);
		System.out.println("Novo Valor é MAIOR que novo valor? >>>>" + isMaior);
		
		System.out.println("");
		
		System.out.println("------------- É MENOR? -------------");
		isMenor = (valor < novoValor);
		System.out.println("Valor é MENOR que Novo valor? >>>>" + isMenor);
		isMenor = (novoValor < valor);
		System.out.println("Novo Valor é MENOR que valor? >>>>" + isMenor);
		

		System.out.println("");
		
		System.out.println("------------- É IGUAL? -------------");
		isIgual = (valor == novoValor);
		System.out.println("Valor é IGUAL que Novo valor? >>>>" + isIgual);
		
		
		System.out.println("");
		
		System.out.println("------------- É DIFERENTE? -------------");
		isDiferente = (valor != novoValor);
		System.out.println("Valor é DIFERENTE que Novo valor? >>>>" + isDiferente);
		
	}
	
}
	