package Lista07.Ex04;

public class Gabinete {
    private String modelo, tipo;
    private int baias;
    private PlacaMae placaMae = new PlacaMae();

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

    public int getBaias() {
        return baias;
    }

    public void setBaias(int baias) {
        this.baias = baias;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    @Override
    public String toString() {
        return "Gabinete{" + "modelo=" + modelo + ", tipo=" + tipo + ", baias=" + baias + ", placaMae=" + placaMae + '}';
    }
}
