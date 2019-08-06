import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float nota4 = 0;
        float media = 0;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextFloat();
        
        System.out.println("Digite a quarta nota: ");
        nota4 = entrada.nextFloat();

        entrada.close();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A média das notas é: "+media);
    }
}