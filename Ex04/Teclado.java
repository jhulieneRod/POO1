package Lista07.Ex04;

public class Teclado {
    private String marca, tipo;

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

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", tipo=" + tipo + '}';
    }
}
