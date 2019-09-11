package Lista07.Ex3;

public class Banco {
    private int codigo, numeroAgencias;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroAgencias() {
        return numeroAgencias;
    }

    public void setNumeroAgencias(int numeroAgencias) {
        this.numeroAgencias = numeroAgencias;
    }

    @Override
    public String toString() {
        return "Banco{" + "codigo=" + codigo + ", numeroAgencias=" + numeroAgencias + '}';
    }
}
