package lista3;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float total = 0;
        float dinheiro;
        float troco;
        float preco;
        int n = 0;
        
        do{   
            n++;
            System.out.print("Produto "+n+": R$ ");
            preco = entrada.nextFloat();
            total = total + preco;
        }while(preco != 0);

        System.out.println("Total: R$ "+total);
        System.out.print("Digite o valor em dinheiro: ");
        dinheiro = entrada.nextFloat();
        troco = dinheiro - total;
        System.out.println("Troco: "+troco);
        System.out.println("...");
        main(args);
    }
}