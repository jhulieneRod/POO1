package Lista06;

public class NomeCompletoMain {
    public static void main(String[] args) {
        
        NomeCompleto n = new NomeCompleto();
        
        n.setNome("Jhuliene");
        n.setSobrenome("Rodrigues");
        
        System.out.println("Seu nome completo é: "+ n.nomeCompleto());
    }
}
