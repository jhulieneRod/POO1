import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float peso = 0;
        float excesso = 0;
        float multa = 0;

        System.out.println("Digite o peso total de peixes: ");
        peso = entrada.nextFloat();

        entrada.close();

        if(peso > 50.00){
            excesso = peso - 50;
            multa = excesso * 4;
    
            System.out.println("Excesso = "+excesso+"KG");
            System.out.println("Multa = R$ "+multa);
        } else if (peso < 50){
            System.out.println("Excesso = Negativo");
            System.out.println("Multa = Negativo");
        } else {
            System.out.println("Excesso = Zero");
            System.out.println("Multa = Zero");
        }
    }
}