package lista1;
import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        
            System.out.print("Insira a data no formato dd/mm/aaaa: ");
            String data  = entrada.nextLine();
            
            String validar[] = data.split("/");
        
            for (int i = 0; i < validar.length; i++) {
			System.out.println(validar[i]);
            }
	}
}
