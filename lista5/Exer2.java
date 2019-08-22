package lista2;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            float menor = 0, maior = 0;
            double mediam = 0;

            float somap[] = new float[5];
            float somam[] = new float[5];

            float matriz[][] = new float[5][5];   

                for (int i = 0; i < matriz.length; i++) {
                    System.out.println("Mercado "+(i+1));
                    for (int j = 0; j < matriz.length; j++) {
                        System.out.println("Produto "+(j+1)+": ");
                        matriz[i][j] = entrada.nextInt();

                        somap[j] += matriz[i][j];
                        somam[i] += matriz[i][j];

                    }
                    if((i == 1)){
                        maior = somam[i];
                        menor = somam[i];
                    }
                    else if(somam[i] > maior){
                        maior = somam[i];
                    }
                    else if(somam[i] < menor){
                        menor = somam[i];
                    }

                }

               System.out.println("Soma de preço por SuperMercado: ");  

               for (int i = 0; i < 5; i++) {      
                    System.out.print("\nSuperMercado "+(i+1)+": "+somam[i]);
                }

               System.out.println("Média de preço por produto: ");
               for (int i = 0; i < 5; i++) {      
                    System.out.print("\nProduto "+(i+1)+": "+(somap[i]/5));
                }

               System.out.println("Valor total SuperMercado mais caro: "+maior);
               System.out.println("Valor total SuperMercado mais barato: "+menor);

                for (int i = 0; i < 5; i++) {
                    System.out.println("Preços do SuperMercado "+(i+1));
                    for (int j = 0; j < 5; j++) {
                       System.out.println("Produto "+(j+1)+":"+matriz[i][j]);
                    }
                }
	}
}
