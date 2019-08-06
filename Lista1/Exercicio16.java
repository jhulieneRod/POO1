import java.util.Scanner;
import java.lang.Math;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float metros = 0;
        double qntd_latas = 0;
        double qntd_galoes = 0;
        double qntd_litros = 0;
        double preco_latas = 0;
        double preco_galoes = 0;
        double resto_latas = 0;
        double resto_galoes = 0;

        System.out.println("Digite a quantidade de metros quadrados a ser pintado: ");
        metros = entrada.nextFloat();

        entrada.close();

        qntd_litros = metros/6;
        qntd_latas = qntd_litros/18;
        resto_latas = qntd_litros%18;
        if(resto_latas > 0){
            qntd_latas = Math.ceil(qntd_latas);
        }
        preco_latas = qntd_latas * 80;

        qntd_galoes = qntd_litros/3.6;
        resto_galoes = qntd_litros%3.6;
        if(resto_galoes > 0){
            qntd_galoes = Math.ceil(qntd_galoes);
        }
            preco_galoes = qntd_galoes * 25;

        System.out.println("Quantidade de latas: "+qntd_latas+" // Preço total: R$ "+preco_latas);
        System.out.println("Quantidade de galões: "+qntd_galoes+" // Preço total: R$ "+preco_galoes);
    }
}