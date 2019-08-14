package lista3;

import java.util.Scanner;

public class Exercicio37 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int maior = 0, menor = 0, cont = 0, soma = 0, nota = 0;
		char[] respostas = new char[10];
		boolean primeiro = true;
                char[] perguntas = {'a','b','c','d','e','e','d','c','b','a'};
        
		System.out.print("Deseja digitar o gabarito? (s- Sim | n- Não)");
		String r = entrada.next();
                
                if ("s".equalsIgnoreCase(r)) {
                    perguntas = new char[10];
                    System.out.println("Digite o gabarito da prova:");
                    for (int i = 0; i < respostas.length; i++) { 
                        System.out.println("Pergunta " + (i + 1) + ":");
                        perguntas[i] = entrada.next().charAt(0);
                    }
                }
                
                System.out.print("Insira 2 para iniciar a prova e 0 para sair: ");
                int n = entrada.nextInt();
                    
		do {
                    nota = 0;
                    cont++;
                    System.out.println("Digite a resposta da prova:");
                    for (int j = 0; j < respostas.length; j++) {
                            System.out.println("Pergunta " + (j + 1) + ":");
                            respostas[j] = entrada.next().charAt(0);

                            if (respostas[j] == perguntas[j]) {
                                nota++;
                            }

                    }
                    soma = soma + nota;

                    if (primeiro) {
                            maior = nota;
                            menor = nota;
                            primeiro = false;
                    } else if (nota > maior) {
                            maior = nota;
                    } else if (nota < menor) {
                            menor = nota;
                    }          

                    System.out.print("Insira 2 para uma nova prova e 0 para sair: ");
                    n = entrada.nextInt();
		}while (n == 2);
		System.out.println("Maior acerto: " + maior);
		System.out.println("Menor acerto: " + menor);
                System.out.println("Total de alunos: " + cont);
		System.out.println("Média das notas da turma: " + (soma / cont));
	}
}