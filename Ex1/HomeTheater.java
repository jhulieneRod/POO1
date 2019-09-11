package Lista07.Ex1;

public class HomeTheater {
    private SistemaDeSom som = new SistemaDeSom();
    private SistemaDeVideo video = new SistemaDeVideo();

    
    public SistemaDeSom getSom() {
        return som;
    }

    public void setSom(SistemaDeSom som) {
        this.som = som;
    }

    public SistemaDeVideo getVideo() {
        return video;
    }

    public void setVideo(SistemaDeVideo video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "HomeTheater{" + "som=" + som + ", video=" + video + '}';
    }
}
