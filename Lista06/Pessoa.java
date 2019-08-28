package Lista06;

public class Pessoa {
    private int idade = 0;
    private String nome = "";
    private double peso = 0,altura = 0;

    public void envelhecer(int idade) {
        this.idade += idade;
        if(idade < 21){
            double tam = idade*0.5;
            crescer(tam);
        }
    }
    public void engordar(double peso) {
        this.peso += peso;
    }

    public void emagrecer(double peso) {
        this.peso -= peso;
    }

    public void crescer(double altura) {
        this.altura += altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    
}
