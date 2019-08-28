package Lista06;

public class bombaCombustível {
    private String tipoCombustivel;
    private float valorLitro;
    private double quantidadeCombustivel;

    public void alterarCombustivel(String tipoCombustivel) {
        if(tipoCombustivel.length() > 5)
            this.tipoCombustivel = tipoCombustivel;
    }

    public void alterarValor(float valorLitro) {
        if(valorLitro > 0)
            this.valorLitro = valorLitro;
    }

    public void alterarQuantidadeCombustivel(double quantidadeCombustivel) {
        if(quantidadeCombustivel > 0)
            this.quantidadeCombustivel -= quantidadeCombustivel;
    }
    
    public double abastecerPorValor(double valor){
        double qtd_litros = 0;
        if(valor > 0 && valor <= this.quantidadeCombustivel)
            qtd_litros = valor / this.valorLitro;
        
        alterarQuantidadeCombustivel(qtd_litros);
        return qtd_litros;
    }
    public double abastecerPorLitro(double litros){
        double valor = 0;
        if(litros > 0 && litros <= this.quantidadeCombustivel)
            valor = litros * this.valorLitro;
        alterarQuantidadeCombustivel(litros);
        return valor;
    }
}
