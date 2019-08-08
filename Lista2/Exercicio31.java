import java.util.Scanner;

public class Exercicio31{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float qtd_carne = 0;
        double total_compra = 0;
        int tipo_pagamento = 0;
        double desconto = 0;
        int tipo_carne = 0;
        double total_compra_final = 0;
        String tipo_carne_resultado = "";
        String tipo_pagamento_resultado = "";

        
        System.out.println("Digite o tipo da carne: (1- Filé Duplo | 2- Alcatra | 3- Picanha)");
        tipo_carne = entrada.nextInt();

        System.out.println("Digite o peso desejado de carne: ");
        qtd_carne = entrada.nextFloat();

        System.out.println("Digite o método de pagamento: (1- Cartão Tabajara | 2- Cartão de Crédito | 3- Dinheiro)");
        tipo_pagamento = entrada.nextInt();

        if (tipo_carne == 1){
            tipo_carne_resultado = "Filé Duplo";
            if(qtd_carne <= 5){
                total_compra = qtd_carne * 4.9;
            }else {
                total_compra = qtd_carne * 5.8;
            }
        }else if (tipo_carne == 2){
            tipo_carne_resultado = "Alcatra";
            if(qtd_carne <= 5){
                total_compra = qtd_carne * 5.9;
            }else {
                total_compra = qtd_carne * 6.8;
            }
        }else if (tipo_carne == 3){
            tipo_carne_resultado = "Picanha";
            if(qtd_carne <= 5){
                total_compra = qtd_carne * 6.9;
            }else {
                total_compra = qtd_carne * 7.8;
            }
        }
        
        if(tipo_pagamento == 1 ){
            tipo_pagamento_resultado = "Cartão Tabajara";
            total_compra_final = total_compra - desconto;
            desconto = total_compra*0.05;
        }else if(tipo_pagamento == 2){
            tipo_pagamento_resultado = "Cartão de Crédito";
            total_compra_final = total_compra;
        }else{
            tipo_pagamento_resultado = "Dinheiro";
            total_compra_final = total_compra;
        }
        System.out.println("Tipo de carne: "+tipo_carne_resultado);
        System.out.println("Quantidade de carne: "+qtd_carne+"Kg");
        System.out.println("Preço total: R$ "+total_compra);
        System.out.println("Tipo de pagamento: "+tipo_pagamento_resultado);
        System.out.println("Valor do desconto: R$ "+desconto);
        System.out.println("Valor a pagar: R$ "+total_compra_final);
    }
}