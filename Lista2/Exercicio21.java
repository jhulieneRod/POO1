import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ano = 0;
        int dia = 0;
        int mes = 0;
        String texto = "";

        System.out.println("Digite uma data (dd/mm/aaaa): ");
        texto = entrada.nextLine();

        entrada.close();

        String data[] = texto.split("/");
        dia = Integer.parseInt(data[0]);
        mes = Integer.parseInt(data[1]);
        ano = Integer.parseInt(data[2]);
        
        if (dia > 0 && dia <= 31) {
            if(mes > 0 && mes <= 12){
                if(mes != 2 && mes != 4 && mes != 6 && mes != 9 && mes != 11){
                    if (dia > 0 && dia <= 31){
                        System.out.println("Data válida!");
                    }else{
                        System.out.println("Data Inválida!");
                    }
                }else if (ano%4 == 0 && ano%100 > 0 && mes == 2) {
                    if(dia > 0 && dia <= 29 ){
                        System.out.println("Data válida!");
                    }else{
                        System.out.println("Data inválida!");
                    }
                }else if(mes == 2 && dia > 0 && dia <= 28){
                    System.out.println("Data válida!");
                }else {
                    System.out.println("Data inválida!");
                }
            }else {
                System.out.println("Data inválida!");
            }
        }else {
            System.out.println("Data inválida!");
        }
    }
}