import java.text.MessageFormat;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		//DECLARAÇÃO DAS VARIAVEIS QUE ULTILIZAREMOS
		int n1;
		int n2;
		boolean isOk = false;//flag
		String resposta;
		
		//INSTANCIA DAS CLASSES E OBJETOS QUE ULTILIZAREMOS
		Scanner entrada = new Scanner(System.in);
		
		//SOLICITAÇÃO DE INTERAÇÃO COM O USÚARIO
		System.out.println("Informe um numero inteiro qualquer >>>> ");
		n1 = entrada.nextInt();
		
		System.out.println("Informe um outro numero inteiro qualquer >>>> ");
		n2 = entrada.nextInt();
		
		//ALGORITIMO PARA SETAR O STATUS DA FLAG
		isOk = (n1 > n2);
		
		//ESTRUTURA CONDICIONAL QUE RETORNA A RESPOSTA QUE SERÁ IMPRESSA AO USUARIO
		if (isOk == true) {
			resposta = MessageFormat.format("O número {0} é MAIOR que o numero {1}", n1, n2); 
			
		} else {
			resposta = MessageFormat.format("ESLE: O número {1} é MAIOR que o numero {0}", n1, n2);
		}
		
		//IMPRESSÃO DA RESPOSTA DE ACORDO COM O RETORNO DA ESTRUTURA CONDICIONAL
		System.out.println("\n--------------------------------------------------------");
		System.out.println(resposta);
		
		//ENCERRA OBJETOS QUE CONSOMEM ESPAÇO EM MEMÓRIA
		entrada.close();
	}
}
