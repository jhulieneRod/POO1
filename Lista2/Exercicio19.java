import java.util.Scanner;
import java.util.*;

public class Exercicio19{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        double x1 = 0;
        double x2 = 0;
        double delta = 0;
        
        System.out.println("Digite o valor de a (ax2+bx+c): ");
        a = entrada.nextInt();

        if(a == 0){
            System.out.println("Equação não é do segundo grau!");
            System.exit(0);
        }else{
            System.out.println("Digite o valor de b (ax2+bx+c): ");
            b = entrada.nextInt();

            System.out.println("Digite o valor de c (ax2+bx+c): ");
            c = entrada.nextInt();
            
            entrada.close();

            delta = (b*b) + (-4 * (a * c));
            if (delta == 0) {
                x1 = (-(b) / 2 * a);
                System.out.println("O delta possui uma raiz: x1 = "+x1); 
            }else if (delta > 0) {
 
                x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
                x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
     
                System.out.println("O delta possui duas raízes: x1 = "+x1+" e x2 = "+x2);
            } else {
                System.out.println("Delta não possui raiz!");
                System.exit(0);
            }
        }
    }
}