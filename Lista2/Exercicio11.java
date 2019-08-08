import java.util.Scanner;

public class Exercicio11{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char turno = 'a';

        System.out.println("Qual turno você estuda? (M-Matutino, V-Vespertino, N-Noturno): ");
        turno = entrada.next().toUpperCase().charAt(0);

        entrada.close();
        
        if(turno == 'M'){
            System.out.println("Bom Dia!");
        }else if(turno == 'V'){
            System.out.println("Boa Tarde!");
        }else{
            System.out.println("Boa Noite!");
        }
    }
}