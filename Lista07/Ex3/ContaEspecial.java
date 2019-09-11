package Lista07.Ex3;

public class ContaEspecial extends ContaBancaria{
    private int diasSemJuros;
    private double limite, saldoEspecial;
    private CartaoDeCredito cartao = new CartaoDeCredito();

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        this.cartao = cartao;
    }
    
    public boolean deposito(double valor){
        boolean result = false; 
        if(valor > 0){
            this.saldoEspecial += valor;
            result = true;
        }
        return result;
    }
    
    public boolean saque(double valor){
        boolean result = false; 
        if(valor > 0 && valor <= (saldoEspecial+limite)){
            saldoEspecial -= valor;
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + "diasSemJuros=" + diasSemJuros + ", limite=" + limite + ", saldo=" + saldoEspecial + ", cartao=" + cartao + '}';
    }
    
    
}
