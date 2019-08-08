import java.util.Scanner;

public class Exercicio14{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        String dia_da_semana = "";
        
        System.out.println("Digite um número inteiro de 1 a 7: ");
        num = entrada.nextInt();

        entrada.close();
        
        if(num == 1){
            dia_da_semana = "Domingo!";
        }else if(num == 2){
            dia_da_semana = "Segunda-Feira!";
        }else if(num == 3){
            dia_da_semana = "Terça-Feira!";
        }else if(num == 4){
            dia_da_semana = "Quarta-Feira!";
        }else if(num == 5){
            dia_da_semana = "Quinta-Feira!";
        }else if(num == 6){
            dia_da_semana = "Sexta-Feira!";
        }else if(num == 7){
            dia_da_semana = "Sábado!";
        }else{
            dia_da_semana = "Valor Inválido!";
        }
        System.out.println("Dia da Semana : "+dia_da_semana);
    }
}