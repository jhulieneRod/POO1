package Lista07.Ex3;

public class ContaBancaria {
    private Banco banco = new Banco();
    private int agencia, numeroDaConta;
    private double saldo;
    private Pessoa correntista = new Pessoa();

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }
    
    public boolean deposito(double valor){
        boolean result = false; 
        if(valor > 0){
            this.saldo += valor;
            result = true;
        }
        return result;
    }
    
    public boolean saque(double valor){
        boolean result = false; 
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            result = true;
        }
        return result;
    }
    
    @Override
    public String toString() {
        return "ContaBancaria{" + "banco=" + banco + ", agencia=" + agencia + ", numeroDaConta=" + numeroDaConta + ", saldo=" + saldo + ", correntista=" + correntista + '}';
    }
}
