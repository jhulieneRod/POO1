package Lista07.Ex1;

public class SistemaDeSom extends EquipamentoEletronico{
    private String marca, modelo;
    private float potencia;

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

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "SistemaDeSom{" + "marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + '}';
    }
}
