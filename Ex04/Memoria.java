package Lista07.Ex04;

public class Memoria {
    private String marca, modelo;
    private float capacidade, velocidade;

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

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Memoria{" + "marca=" + marca + ", modelo=" + modelo + ", capacidade=" + capacidade + ", velocidade=" + velocidade + '}';
    }
}
