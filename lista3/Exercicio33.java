package lista3;
import java.util.Scanner;

public class Exercicio33 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor da dívida: ");
		float divida = entrada.nextFloat();

		entrada.close();

		for (int i = 0; i <= 12; i = i + 3) {
			if (i == 0) {
				System.out.println("Valor da dívida: " + divida);
				System.out.println("Quantidade de parcelas: 1");
				System.out.println("Valor dos juros: 0");
				System.out.println("Valor da parcela: " + divida);
                                System.out.println("-----------");
			} else if (i == 3) {
				System.out.println("Valor da dívida: " + (divida + (divida * 0.1)));
				System.out.println("Quantidade de parcelas: " + i);
				System.out.println("Valor dos juros:" + (divida * 0.1));
				System.out.println("Valor da parcela: " + ((divida / i) + ((divida * 0.1) / i)));
                                System.out.println("-----------");
			} else if (i == 6) {
				System.out.println("Valor da dívida: " + (divida + (divida * 0.15)));
				System.out.println("Quantidade de parcelas: " + i);
				System.out.println("Valor dos juros:" + (divida * 0.15));
				System.out.println("Valor da parcela: " + ((divida / i) + ((divida * 0.15) / i)));
                                System.out.println("-----------");
			} else if (i == 9) {
				System.out.println("Valor da dívida: " + (divida + (divida * 0.2)));
				System.out.println("Quantidade de parcelas: " + i);
				System.out.println("Valor dos juros:" + (divida * 0.2));
				System.out.println("Valor da parcela: " + ((divida / i) + ((divida * 0.2) / i)));
                                System.out.println("-----------");
			} else {
				System.out.println("Valor da dívida: " + (divida + (divida * 0.25)));
				System.out.println("Quantidade de parcelas: " + i);
				System.out.println("Valor dos juros:" + (divida * 0.25));
				System.out.println("Valor da parcela: " + ((divida / i) + ((divida * 0.25) / i)));
			}

		}

	}
}