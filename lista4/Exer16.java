package lista1;
import java.util.Scanner;

public class Exer16 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de n�meros para verifica��o: ");
        int qtd = entrada.nextInt();
        
        int numero[] = new int[qtd];   
        
            for (int i = 0; i < numero.length; i++) {

                    System.out.print("Insira o n�mero: ");
                    numero[i] = entrada.nextInt();
	
	        while((numero[i]<0)||(numero[i]>20)){
                    System.out.print("Insira um n�mero v�lido: ");
                    numero[i] = entrada.nextInt();
                }
		
            }
            
        System.out.println("Gr�fico: ");
        
            for (int i = 0; i < numero.length; i++) {
                System.out.print("\n"+numero[i]+": ");
                for (int j = 0; j < numero[i]; j++) {
                    System.out.print("#");
                }
                
            }
            
	}
}
