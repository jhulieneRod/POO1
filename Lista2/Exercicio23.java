import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade1 = 0;
        int idade2 = 0;
        int idade3 = 0;
        int media = 0;

        System.out.println("Digite a primeira idade: ");
        idade1 = entrada.nextInt();

        System.out.println("Digite a segunda idade: ");
        idade2 = entrada.nextInt();

        System.out.println("Digite a terceira idade: ");
        idade3 = entrada.nextInt();

        entrada.close();

        media = (idade1 + idade2 + idade3) / 3;

        if (media < 25) {
            System.out.println("Turma Jovem!");
        }else if(media >= 25 && media <= 40) {
            System.out.println("Turma Adulta!");
        }else{
            System.out.println("Turma Idosa!");
        }
    }
}