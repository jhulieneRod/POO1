package Lista07.Ex04;

public class Hd {
    private String marca, modelo;
    private float capacidade;
    private int rpm;

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

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "Hd{" + "marca=" + marca + ", modelo=" + modelo + ", capacidade=" + capacidade + ", rpm=" + rpm + '}';
    }
}
