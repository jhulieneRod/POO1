import java.util.Scanner;

public class Exercicio7{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float maior = 0;
        float meio = 0;
        float menor = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextFloat();

        System.out.println("Digite o terceiro número: ");
        num3 = entrada.nextFloat();

        entrada.close();
        if(num1 != num2 && num1 != num3){
            if (num1 > num2 && num1 > num3) {
                maior = num1;
                if(num2 > num3){
                    meio = num2;
                    menor = num3;
                }else{
                    meio = num3;
                    menor = num2;
                }
            }else if (num2 > num1 && num2 > num3) {
                maior = num2;
                if(num1 > num3){
                    meio = num1;
                    menor = num3;
                }else{
                    meio = num3;
                    menor = num1;
                }
            }else if(num3 > num1 && num3 > num2) {
                maior = num3;
                if(num1 > num2){
                    meio = num1;
                    menor = num2;
                }else{
                    meio = num2;
                    menor = num1;
                }
            }
            System.out.println("Ordem decrescente: "+menor+" - "+meio+" - "+maior);
        }else{
                System.out.println("Números iguais!");
            }
    }
}