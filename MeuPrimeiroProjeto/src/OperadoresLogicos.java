
public class OperadoresLogicos {

	public static void main(String[] args) {
		
		double saldo = 50.00;
		boolean isOk = false;
		
		// && - Conjun��o Aditiva
		// || - Conjun��o Alternativa
		
		isOk = (saldo > 10 && saldo < 100);
		System.out.println(isOk + ", pois o SALDO � maior que 10 e menor que 100!");
		
		isOk = (saldo > 10 && saldo < 40);
		System.out.println(isOk + ". pois o SALDO � maior que 10, mas n�o � menor que 40!");
		
		isOk = (saldo > 10 || saldo < 40);
		System.out.println(isOk + ", pois ou o SALDO � maior que 10 ou menor que 40!");
		
		isOk = (saldo > 60 || saldo < 40);
		System.out.println(isOk + ", pois o SALDO n�o � maior que 60 ou menor que 40!");
		
		isOk = (saldo > 10 && saldo < 100 && saldo == 50.00);
		System.out.println(isOk + ", pois o SALDO � maior que 10, e ao mesmo tempo tambem � menor que 100 e possui valor igual a 50.00!");
	}
}
