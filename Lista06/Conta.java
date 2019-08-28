package Lista06;

public class Conta {
    
    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void incluirConta(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void alterarNome(String nome){
        if(nome.length() > 2)
            this.nome = nome;
    }
    
    public void deposito(float saldo){
        if(saldo > 0)
            this.saldo += saldo; 
    }
    
    public void saque(float saldo){
        if(saldo <= this.saldo)
            this.saldo -= saldo;
    }
}
