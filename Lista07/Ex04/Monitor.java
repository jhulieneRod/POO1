package Lista07.Ex04;

public class Monitor {
    private String marca, tipo, resolucao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        return "Monitor{" + "marca=" + marca + ", tipo=" + tipo + ", resolucao=" + resolucao + '}';
    }
    
    
}
