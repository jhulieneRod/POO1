package lista1;
import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            
		System.out.println("Informe uma mensagem: ");
		String mensagem = entrada.nextLine();
		
		char [] letras = mensagem.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
	}
}
