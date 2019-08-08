import java.util.Scanner;

public class Exercicio15{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo = 0;
        float preco = 0;
        String origem = "";
        
        System.out.println("Digite o preço do produto: ");
        preco = entrada.nextFloat();

        System.out.println("Digite o código de origem do produto: ");
        codigo = entrada.nextInt();

        entrada.close();
        
        if(codigo == 1){
            origem = "Sul!";
        }else if(codigo == 2){
            origem = "Norte!";
        }else if(codigo == 3){
            origem = "Leste!";
        }else if(codigo == 4){
            origem = "Oeste!";
        }else if(codigo == 5 || codigo == 6){
            origem = "Nordeste!";
        }else if(codigo == 7 || codigo == 8){
            origem = "Centro-Oeste!";
        }else{
            origem = "Importado!";
        }
        System.out.println("Preço do produto: R$ "+preco+"\nOrigem: "+origem);
    }
}