import java.util.Scanner;
import java.lang.Math;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float metros = 0;
        double qntd_latas = 0;
        double qntd_litros = 0;
        double preco = 0;
        double resto = 0;

        System.out.println("Digite a quantidade de metros quadrados a ser pintado: ");
        metros = entrada.nextFloat();

        entrada.close();
        qntd_litros = metros/3;
        qntd_latas = qntd_litros/18;
        resto = qntd_litros%18;

        if(resto > 0){
            qntd_latas = Math.round(qntd_latas);
        }
        preco = qntd_latas * 80;

        System.out.println("A quantidade de latas a ser compradas é: "+qntd_latas+"\nPreço total: R$ "+preco);
    }
}