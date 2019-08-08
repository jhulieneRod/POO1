import java.util.Scanner;

public class Exercicio30{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float qtd_morangos = 0;
        double valor_morangos = 0;
        float qtd_macas = 0;
        double valor_macas = 0;
        double total_compra = 0;
        double peso_total = 0;
        
        System.out.println("Digite o peso total de morangos: ");
        qtd_morangos = entrada.nextFloat();

        System.out.println("Digite o peso total de macãs: ");
        qtd_macas = entrada.nextFloat();

        if(qtd_macas <= 5){
            valor_macas = qtd_macas * 2.5;
        }else {
            valor_macas = qtd_macas * 2.2;
        }
        if(qtd_morangos <= 5){
            valor_morangos = qtd_morangos * 1.8;
        }else{
            valor_morangos = qtd_morangos * 1.5;
        }
        total_compra = valor_macas + valor_morangos;
        peso_total = qtd_macas + qtd_morangos;

        if(total_compra > 25 && peso_total > 8){
            total_compra = total_compra - (total_compra*0.1);
        }
        System.out.println("Total a pagar: R$ "+total_compra);
    }
}