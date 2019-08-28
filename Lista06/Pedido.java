package Lista06;

public class Pedido {
    private int cod, qtd;
    private double valorTotal = 0;
    String saida = "";
    
    public void adicionaItem(int cod, int qtd){
        this.cod = cod;
        this.qtd = qtd;
       
        valorTotal += valorItem();
        montaSaida(cod,qtd);
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    public String descItem(){
        String itemAdicionado = "";
        switch(cod){
            case 100:
                itemAdicionado = "Cachorro Quente";
            break;
            case 101: 
                itemAdicionado = "Bauru Simples";
            break;
            case 102:
                itemAdicionado = "Bauru com ovo";
            break;
            case 103:
                itemAdicionado = "Hambúrger";
            break;
            case 104: 
                itemAdicionado = "Cheeseburger";
            break;
            case 105:
                itemAdicionado = "Refrigerante";
            break;
        }
        return itemAdicionado;
    }
    
    public double valorItem(){
        float valor1 = 1.2f;
        float valor2 = 1.3f;
        float valor3 = 1.5f;
        float valor4 = 1.2f;
        float valor5 = 1.3f;
        float valor6 = 1.0f;
        double valorItem = 0;
        String itemAdicionado = "";
        
        switch(cod){
            case 100:
                valorItem = valor1 * qtd;
                itemAdicionado = "Cachorro Quente";
            break;
            case 101: 
                valorItem = valor2 * qtd;
                itemAdicionado = "Bauru Simples";
            break;
            case 102:
                valorItem = valor3 * qtd;
                itemAdicionado = "Bauru com ovo";
            break;
            case 103:
                valorItem = valor4 * qtd;
                itemAdicionado = "Hambúrger";
            break;
            case 104: 
                valorItem = valor5 * qtd;
                itemAdicionado = "Cheeseburger";
            break;
            case 105:
                valorItem = valor6 * qtd;
                itemAdicionado = "Refrigerante";
            break;
        }
        return valorItem;
    }
    public void montaSaida(int cod, int qtd){
        saida += descItem()+": R$ "+valorItem()+"\n";
    }

    public String getSaida() {
        return saida;
    }
}
