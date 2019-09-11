package Lista07.Ex2;

public class Carro {
    private String fabricane, modelo, cor;
    private int ano;
    private Pessoa dono = new Pessoa();
    private Motor motor = new Motor();

    public String getFabricane() {
        return fabricane;
    }

    public void setFabricane(String fabricane) {
        this.fabricane = fabricane;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" + "fabricane=" + fabricane + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", dono=" + dono + ", motor=" + motor + '}';
    }
    
}
