package Lista07.Ex2;

public class CarroMain {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Motor m = new Motor();
        Carro c = new Carro();
        
        p.setNome("Jhuliene");
        p.setEndereco("Rua tal, Bairro Tal, cidade tal, Sc");
        
        m.setCilindros(3);
        m.setCombustivel("Gasolina");
        m.setMarca("Teste");
        m.setPotencia(68);
        
        c.setAno(2019);
        c.setCor("Azul");
        c.setDono(p);
        c.setFabricane("Toyota");
        c.setModelo("Corolla");
        c.setMotor(m);
        
        System.out.println(c.toString()); 
    }
}
