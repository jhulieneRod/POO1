package googleCharts;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// constroi o objeto que guarda os dados do grafico
		Grafico g = new Grafico();
		g.setVetor(novoVetor()); // inicializa o atrributo que guarda o vetor a ser usado no gr�fico
		
		try {
			GerarHTML.gerarHtml(g.getVetor());
		} catch (IOException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	/**
	 * pega os dados do usuario e retorna o vetor
	 * 
	 * @return int[] vetor
	 */
	public static String[][] novoVetor() {
                System.out.println("----Gráfico Donut----");
		System.out.println("Informe o número de dados a inserir: ");
		int quantidade = entrada.nextInt();
                String vet[][] = new String [quantidade][2];
                
                for (int i=0; i<vet.length; i++) {                    
                    for (int j=0; j<2; j++) {
                        System.out.println("Informe uma descrição: ");
                        vet[i][j] = entrada.next();
                        j++;
                        entrada.nextLine();
                        System.out.println("Informe a quantidade: ");
			vet[i][j] = entrada.next();
                        
                    }
                }
		System.out.println("Dados salvos com sucesso.");
		entrada.close();
                
		return vet;
	}

}
