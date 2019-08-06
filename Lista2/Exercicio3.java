import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char letra = 'a';
        String resultado = "";

        System.out.println("Digite uma letra (F ou M): ");
        letra = entrada.nextLine().toUpperCase().charAt(0);

        if (letra == 'F') {
            resultado = "F - Feminino";
        }else if (letra == 'M'){
            resultado = "M - Masculino";
        }else {
            resultado = "A letra digitada é diferente de F ou M!";
        }
    
        System.out.println(resultado);
    }
}