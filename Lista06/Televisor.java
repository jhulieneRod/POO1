package Lista06;

public class Televisor {
    
    private int canal,volume = 0;

    public void mudarCanal(int canal) {
        if(canal > 0 && canal < 100)
            this.canal = canal;
    }

    public void aumentarVolume() {
        if(volume < 100)
            this.volume += 1;
    }

    public void diminuirVolume() {
        if(volume > 0)
            this.volume -= 1;
    }
}
