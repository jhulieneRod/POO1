package Lista07.Ex04;

public class ComputadorMain {
    public static void main(String[] args) {
        Hd hd = new Hd();
        hd.setCapacidade(56);
        hd.setMarca("teste");
        hd.setModelo("teste");
        hd.setRpm(53);
        
        Memoria m = new Memoria();
        m.setCapacidade(5);
        m.setMarca("Kingston");
        m.setModelo("sdfsd4");
        m.setVelocidade(1300);
        
        Processador p = new Processador();
        p.setCache(56);
        p.setClock(656);
        p.setMarca("Intel");
        p.setModelo("i5");
        
        PlacaMae pm = new PlacaMae();
        pm.setHd(hd);
        pm.setMarca("Dell");
        pm.setMemoria(m);
        pm.setModelo("sfa4");
        pm.setProcessador(p);
        
        Gabinete g = new Gabinete();
        g.setBaias(8);
        g.setModelo("4sds");
        g.setPlacaMae(pm);
        g.setTipo("dfdf");
        
        Monitor mn = new Monitor();
        mn.setMarca("hp");
        mn.setResolucao("1800");
        mn.setTipo("idhyf");
        
        Teclado t = new Teclado();
        t.setMarca("dhfjk");
        t.setTipo("sfds");
        
        Mouse mo = new Mouse();
        mo.setMarca("hjdfbd");
        mo.setTipo("dkfj");
        
        Computador c = new Computador();
        c.setConsumo(656);
        c.setGabinete(g);
        c.setMarca("mknc");
        c.setModelo("hjdf");
        c.setMonitor(mn);
        c.setMouse(mo);
        c.setTeclado(t);
        c.setTensao(65);
    }
}
