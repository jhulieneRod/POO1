import java.util.Scanner;

public class Exercicio16 {
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

        if (media >= 0 && media <= 3) {
            System.out.println("Aluno Reprovado!");
        }else if (media > 3 && media <= 6.9) {
            System.out.println("Aluno em exame!");
        }else{
            System.out.println("Aluno Aprovado!");
        }
    }
}