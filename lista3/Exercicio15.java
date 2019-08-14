package lista3;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = 37;
        int y = 38;
        int z = 1;
        String s = "";
   
        s = "S = (" + x + "*" + y + ")/" + z;
        for(int i = z+1; i <= 37; i++){
            x--;
            y--;
            s = s + " + (" + x + "*" + y + ")/" + i;
        }
        System.out.println(s);
    }
}