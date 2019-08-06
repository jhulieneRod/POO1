import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        entrada.close();

        if (num%2 == 0) {
            num = num + 1;
            System.out.println("Resultado ímpar: "+num);    
        }else{
            num = num + 1;
            System.out.println("Resultado par: "+num);
        }
        

        
    }
}