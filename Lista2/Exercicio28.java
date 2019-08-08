import java.util.Scanner;

public class Exercicio28{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        char operacao = 'a';
        double resultado = 0;
        String tipo1 = "";
        String tipo2 = "";
        String tipo3 = "";
        
        System.out.println("Digite o primeiro número: ");
        num1 = entrada.nextFloat();

        System.out.println("Digite o primeiro número: ");
        num2 = entrada.nextFloat();

        System.out.println("Digite o simbolo da operação que deseja realizar (*, -, +): ");
        operacao = entrada.next().charAt(0);

        if(operacao == '+'){
            resultado = num1 + num2;
        }else if(operacao == '-'){
            resultado = num1 - num2;
        }else if(operacao == '*'){
            resultado = num1 * num2;
        }
        if(resultado%2 == 0){
            tipo1 = "Par!";
        }else{
            tipo1 = "Impar";
        }
        if(resultado >= 0){
            tipo2 = "Positivo";
        }else{
            tipo2 = "Negativo";
        }
        if(resultado%1 == 0){
            tipo3 = "Inteiro";
        }else{
            tipo3 = "Decimal";
        }
        System.out.println("Resultado: "+resultado);
        System.out.println("O número é: "+tipo1+", "+tipo2+" e "+tipo3);
    }
}