package Lista07.Ex04;

public class PlacaMae {
    private String marca, modelo;
    private Processador processador = new Processador();
    private Hd hd = new Hd();
    private Memoria memoria = new Memoria();

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

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "PlacaMae{" + "marca=" + marca + ", modelo=" + modelo + ", processador=" + processador + ", hd=" + hd + ", memoria=" + memoria + '}';
    }
}
