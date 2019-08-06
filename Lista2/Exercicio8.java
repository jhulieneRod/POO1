import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = 0;
        float nota2 = 0;
        float media = 0;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        entrada.close();

        media = (nota1 + nota2)/2;

        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        }else {
            System.out.println("Aluno Reprovado!");
        }
    }
}