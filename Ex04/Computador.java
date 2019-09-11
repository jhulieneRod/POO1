package Lista07.Ex04;

public class Computador extends EquipamentoEletronico{
    private String marca, modelo;
    private Gabinete gabinete = new Gabinete();
    private Teclado teclado = new Teclado();
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();

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

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computador{" + "marca=" + marca + ", modelo=" + modelo + ", gabinete=" + gabinete + ", teclado=" + teclado + ", mouse=" + mouse + ", monitor=" + monitor + '}';
    }
}
