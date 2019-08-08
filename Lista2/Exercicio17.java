import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota1 = 0;
        float nota2 = 0;
        float media = 0;
        String conceito = "";
        String mensagem = "";

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        entrada.close();

        media = (nota1 + nota2)/2;

        if (media >= 9 && media <= 10) {
            conceito = "A";
            mensagem = "Aprovado!";
        }else if (media >= 7.5 && media < 9) {
            conceito = "B";
            mensagem = "Aprovado!";
        }else if (media >= 6 && media < 7.5) {
            conceito = "C";
            mensagem = "Aprovado!";
        }else if (media >= 4 && media < 6) {
            conceito = "D";
            mensagem = "Reprovado!";
        }else {
            conceito = "E";
            mensagem = "Reprovado!";
        }
        System.out.println("Nota 1: "+nota1+" - Nota 2: "+nota2+"\nMédia: "+media+"\nConceito: "+conceito+"\n"+mensagem);
    }
}