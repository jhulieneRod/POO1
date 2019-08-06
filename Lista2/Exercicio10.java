import java.util.Scanner;

public class Exercicio10{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
        float maior = 0;
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
                    menor = num3;
                }else{
                    menor = num2;
                }
            }else if (num2 > num1 && num2 > num3) {
                maior = num2;
                if(num1 > num3){
                    menor = num3;
                }else{
                    menor = num1;
                }
            }else if(num3 > num1 && num3 > num2) {
                maior = num3;
                if(num1 > num2){
                    menor = num2;
                }else{
                    menor = num1;
                }
            }
            System.out.println("Maior: "+maior+"\nMenor: "+menor);
        }else{
                System.out.println("Números iguais!");
            }
    }
}