package Lista07.Ex1;

public class EquipamentoEletronicoMain {
    public static void main(String[] args) {
        HomeTheater home = new HomeTheater();
        SistemaDeSom som = new SistemaDeSom();
        SistemaDeVideo video = new SistemaDeVideo();
        
        som.setConsumo(2);
        som.setMarca("Philco");
        som.setModelo("4554f");
        som.setTensao(3);
        
        video.setConsumo(6);
        video.setMarca("Samsung");
        video.setModelo("df54");
        video.setTipo("teste");
        video.setResolucao("1800");
        video.setTensao(4);
        
        home.setSom(som);
        home.setVideo(video);
        
        System.out.println(home.toString());
    }
}
