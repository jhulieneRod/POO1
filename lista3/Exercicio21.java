package lista3;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int idade;
        float soma = 0;
        float media;
        
        System.out.println("Digite a quantidade de alunos: ");
        n = entrada.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Digite a idade do "+i+"° aluno: ");
            idade = entrada.nextInt();
            soma = soma + idade;
        }
        media = soma / n;
        if(media > 0 && media <= 25){
            System.out.println("Turma Jovem!");
        }else if (media >= 26 && media <= 60){
            System.out.println("Turma Adulta!");
        }else{
            System.out.println("Turma Idosa!");
        }
    }
    
}
