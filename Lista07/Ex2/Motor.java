package Lista07.Ex2;

public class Motor {
    private String marca, combustivel;
    private float potencia;
    private int cilindros;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Motor{" + "marca=" + marca + ", combustivel=" + combustivel + ", potencia=" + potencia + ", cilindros=" + cilindros + '}';
    }
    
    
}
