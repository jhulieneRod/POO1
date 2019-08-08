import java.util.Scanner;

public class Exercicio29{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float sim = 0;
        char resposta = 'a';
        
        System.out.println("Telefonou para a vítima? (S-sim, N-não)");
        resposta = entrada.nextLine().toUpperCase().charAt(0);
        if(resposta == 'S'){
            sim = sim + 1;
        }

        System.out.println("Esteve no local do crime? (S-sim, N-não)");
        resposta = entrada.nextLine().toUpperCase().charAt(0);
        if(resposta == 'S'){
            sim = sim + 1;
        }
        System.out.println("Mora perto da vítima? (S-sim, N-não)");
        resposta = entrada.nextLine().toUpperCase().charAt(0);
        if(resposta == 'S'){
            sim = sim + 1;
        }
        System.out.println("Devia para a vítima? (S-sim, N-não)");
        resposta = entrada.nextLine().toUpperCase().charAt(0);
        if(resposta == 'S'){
            sim = sim + 1;
        }
        System.out.println("Já trabalhou com a vítima? (S-sim, N-não)");
        resposta = entrada.nextLine().toUpperCase().charAt(0);
        if(resposta == 'S'){
            sim = sim + 1;
        }
        
        if(sim == 2){
            System.out.println("Suspeita!");
        }else if(sim > 2 && sim <= 4){
            System.out.println("Cúmplice!");
        }else if (sim == 5){
            System.out.println("Assasino!");
        }else{
            System.out.println("Inocente!");
        }
    }
}