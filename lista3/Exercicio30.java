package lista3;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float menor = 0;
                float c_menor = 0;
                float maior = 0;
                float c_maior = 0;
                float magro = 0;
                float c_magro = 0;
                float gordo = 0;
                float c_gordo = 0;
                float altura = 0;
                float peso = 0;
		int cont = 0;
                int codigo = 1;
                float media_alt = 0;
                float media_peso = 0;
                float soma_peso = 0;
                float soma_alt = 0;
		
                System.out.print("Digite seu código: ");
                codigo = entrada.nextInt();
                do {                  
			System.out.print("Insira sua altura: ");
			altura = entrada.nextFloat();

			System.out.print("Insira seu peso: ");
			peso = entrada.nextFloat();
                        
                        soma_alt = soma_alt + altura;
                        soma_peso = soma_peso + peso;
			if (cont == 0) {
				maior = altura;
				menor = altura;
				magro = peso;
				gordo = peso;
                                c_maior = codigo;
				c_menor = codigo;
				c_magro = codigo;
				c_gordo = codigo;
                                
			} else if (altura > maior) {
				maior = altura;
                                c_maior = codigo;

			} else if (altura < menor) {
				menor = altura;
                                c_menor = codigo;
			}
                        if (peso > gordo) {
				gordo = peso;
                                c_gordo = codigo;

			} else if (peso < magro) {
				magro = peso;
                                c_magro = codigo;
			}
			cont++;
                        System.out.println("-----------");
                        System.out.print("Digite seu código: ");
                        codigo = entrada.nextInt();
		}while (codigo != 0);
		
                media_alt = soma_alt / cont;
                media_peso = soma_peso / cont;
                System.out.println("-----------");
		System.out.println("Código do mais alto: " + c_maior + " | Altura: "+maior);
		System.out.println("Código do mais baixo: " + c_menor + " | Altura: "+menor);
                System.out.println("Código do mais gordo: " + c_gordo + " | Peso: "+gordo);
                System.out.println("Código do mais magro: " + c_magro + " | Peso: "+magro);
                System.out.println("Média das alturas: " + media_alt);
                System.out.println("Média de pesos: " + media_peso);
	}
}