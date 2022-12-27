import javax.swing.JOptionPane;

public class Calculadora {
	
	public static void somar(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		    
		JOptionPane.showMessageDialog(null, resultado, null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		somar(12, 50);
	}

}
