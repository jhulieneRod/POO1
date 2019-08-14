package lista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome ;
        int idade;
        float salario;
        String sexo;
        String estado_civil;

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        while (nome.length() < 3) {
            System.out.println("Digite seu nome: ");
            nome = entrada.nextLine();
        }

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();
        }

        System.out.println("Digite seu SalÃ¡rio: ");
        salario = entrada.nextFloat();
        while (salario < 0) {
            System.out.println("Digite seu SalÃ¡rio: ");
            salario = entrada.nextFloat();
            System.out.println(salario);
        }
        entrada.nextLine();
        System.out.println("Digite seu sexo: (f-Feminino / m-Masculino)");
        sexo = entrada.nextLine();
        while (!"f".equalsIgnoreCase(sexo) && !"m".equalsIgnoreCase(sexo)) {
            System.out.println("Digite seu sexo: (f-Feminino / m-Masculino)");
            sexo = entrada.nextLine();
        }

        System.out.println("Digite seu estado civil: (s-Solteirx / c-Casadx / v-Viuvx / d-Divorciadx)");
        estado_civil = entrada.nextLine();
        while (!"s".equalsIgnoreCase(estado_civil) || !"c".equalsIgnoreCase(estado_civil) || !"v".equalsIgnoreCase(estado_civil) || !"d".equalsIgnoreCase(estado_civil)) {
            System.out.println("Digite seu estado civil: (s-Solteirx / c-Casadx / v-Viuvx / d-Divorciadx)");
            estado_civil = entrada.nextLine();
        }
        System.exit(0);
    }
}