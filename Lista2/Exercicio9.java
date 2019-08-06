import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float altura = 0;
        float peso = 0;
        double peso_ideal = 0;
        String mensagem = "";
        char sexo = 'a';

        System.out.println("Digite sua altura: ");
        altura = entrada.nextFloat();

        System.out.println("Digite sua peso: ");
        peso = entrada.nextFloat();

        System.out.println("Digite seu sexo (M ou F): ");
        sexo = entrada.next().toUpperCase().charAt(0);

        entrada.close();

        if(sexo == 'H'){
            peso_ideal = (72.7*altura) - 58;
            if(peso > peso_ideal){
                mensagem = "Acima do peso!";
            }else if(peso < peso_ideal){
                mensagem = "Abaixo do peso!";
            }else {
                mensagem = "No peso ideal!";
            }
        }else {
            peso_ideal = (62.1*altura) - 44.7;
            if(peso > peso_ideal){
                mensagem = "Acima do peso!";
            }else if(peso < peso_ideal){
                mensagem = "Abaixo do peso!";
            }else {
                mensagem = "No peso ideal!";
            }
        }

        System.out.println("Altura: "+altura+"cm\n Peso: "+peso+"Kg\n Sexo: "+sexo);
        System.out.println("Peso Ideal: "+peso_ideal+"\n"+mensagem);
    }
}