import java.util.Scanner;

public class Exercicio32{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String resultado = "";
        char q = 'a';
        char qg = 'a';
        
        System.out.println("Digite a resposta da primeira questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'A'){
            resultado = "Q1: "+q;
        }else{
            resultado = "Q1: "+q+": (a)";
        }
        System.out.println("Digite a resposta da segunda questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'A'){
            resultado = resultado + "\nQ2: "+q;
        }else{
            resultado = resultado + "\nQ2: "+q+": (a)";
        }
        System.out.println("Digite a resposta da terceira questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'B'){
            resultado = resultado + "\nQ3: "+q;
        }else{
            resultado = resultado + "\nQ3: "+q+": (b)";
        }
        System.out.println("Digite a resposta da quarta questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'B'){
            resultado = resultado + "\nQ4: "+q;
        }else{
            resultado = resultado + "\nQ4: "+q+": (b)";
        }
        System.out.println("Digite a resposta da quinta questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'C'){
            resultado = resultado + "\nQ5: "+q;
        }else{
            resultado = resultado + "\nQ5: "+q+": (c)";
        }
        System.out.println("Digite a resposta da sexta questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'C'){
            resultado = resultado + "\nQ6: "+q;
        }else{
            resultado = resultado + "\nQ6: "+q+": (c)";
        }
        System.out.println("Digite a resposta da sétima questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'D'){
            resultado = resultado + "\nQ7: "+q;
        }else{
            resultado = resultado + "\nQ7: "+q+": (d)";
        }
        System.out.println("Digite a resposta da oitava questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'D'){
            resultado = resultado + "\nQ8: "+q;
        }else{
            resultado = resultado + "\nQ8: "+q+": (d)";
        }
        System.out.println("Digite a resposta da nona questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'E'){
            resultado = resultado + "\nQ9: "+q;
        }else{
            resultado = resultado + "\nQ9: "+q+": (e)";
        }
        System.out.println("Digite a resposta da décima questão: ");
        q = entrada.next().toUpperCase().charAt(0); 
        if(q == 'E'){
            resultado = resultado + "\nQ10: "+q;
        }else{
            resultado = resultado + "\nQ10: "+q+": (e)";
        }
        System.out.println(resultado);
    }
}