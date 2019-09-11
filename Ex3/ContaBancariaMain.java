package Lista07.Ex3;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Banco b = new Banco();
        CartaoDeCredito c = new CartaoDeCredito();
        ContaSimples cs = new ContaSimples();
        ContaEspecial ce = new ContaEspecial();
        
        p.setNome("Jhuliene");
        p.setEndereco("Rua tal, Bairro Tal, cidade tal, Sc");
        
        b.setCodigo(01);
        b.setNumeroAgencias(563);
        
        c.setLimite(1500);
        c.setNumero(56895);
        c.setOperadora("Elo");
        c.setTipoDeCartao("Gold");
        
        cs.setAgencia(256);
        cs.setBanco(b);
        cs.setCorrentista(p);
        cs.setNumeroDaConta(21656);
        cs.setSaldo(500);
        cs.setSaldoPoupanca(200);
        
        ce.setAgencia(563);
        ce.setBanco(b);
        ce.setCartao(c);
        ce.setCorrentista(p);
        ce.setDiasSemJuros(7);
        ce.setLimite(500);
        ce.setNumeroDaConta(56455);
        ce.setSaldo(896);
    }
}
