import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe um numero >>>>");
		int numero = scanner.nextInt();
		
		int restoDaDivisao = numero % 2;
		
		if (restoDaDivisao == 0) {
			System.out.println("É par");
			
		} 
	
	}
} 
