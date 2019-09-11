package Lista07.Ex1;

public class SistemaDeVideo extends EquipamentoEletronico{
    private String marca, modelo, tipo, resolucao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return "SistemaDeVideo{" + "marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", resolucao=" + resolucao + '}';
    }
}
