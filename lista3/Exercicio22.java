package lista3;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        float voto;
        
        System.out.println("Números dos candidatos:\n1-Candidato 1 \n2-Candidato 2 \n3-Candidato 3");
        System.out.println("Digite a quantidade de votantes: ");
        n = entrada.nextInt();
        
        for(int i = 1; i <= n; i++){
            
            do{
                System.out.println("Voto do "+i+"° aluno: ");
                voto = entrada.nextInt();
                if(voto <= 0 || voto > 3){
                    System.out.println("Número Inválido . . . Digite Novamente . . .");
                }
            }while(voto <= 0 || voto > 3);
            
            if(voto == 1){
                c1 = c1 + 1;
            }else if (voto == 2){
                c2 = c2 + 1;
            }else{
                c3 = c3 + 1;
            }
        }        
        System.out.println("Total de votos do candidato 1: "+c1);
        System.out.println("Total de votos do candidato 2: "+c2);
        System.out.println("Total de votos do candidato 3: "+c3);
    }
    
}
