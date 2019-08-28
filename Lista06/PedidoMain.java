package Lista06;

public class PedidoMain {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        
        p.adicionaItem(100, 2);
        p.adicionaItem(105, 1);
        p.adicionaItem(102, 1);
        
        System.out.println(p.getSaida());
        System.out.println("Valor total: R$ "+p.getValorTotal());
    }
}
