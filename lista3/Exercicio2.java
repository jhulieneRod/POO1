import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome_usuario;
        String senha; 

        System.out.println("Digite um nome de usuÃ¡rio: ");
        nome_usuario = entrada.nextLine();

        System.out.println("Digite uma senha: ");
        senha = entrada.nextLine();

        while (nome_usuario.equalsIgnoreCase(senha)) {
            System.out.println("Digite uma senha e um nome de usuÃ¡rio diferente!");
            System.out.println("Digite um nome de usuÃ¡rio: ");
            nome_usuario = entrada.nextLine();
            System.out.println("Digite uma senha: ");
            senha = entrada.nextLine();
        }
        System.out.println("Nome de usuario: "+nome_usuario+"\nSenha: "+senha);

    }
}