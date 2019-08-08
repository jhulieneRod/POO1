import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float media = 0;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextFloat();
        
        entrada.close();

        media = (nota1 + nota2 + nota3)/3;

        if (media >= 7) {
            if(media == 10){
                System.out.println("Aprovado com Distinção!");
            }else {
                System.out.println("Aluno aprovado com média "+media);
            }
        }else {
            System.out.println("Aluno reprovado com média "+media);
        }
    }
}