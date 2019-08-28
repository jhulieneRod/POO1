package Lista06;

public class Intervalo {
    
    private int inicio,fim;

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }
    
    public boolean verificaNumeros(){
        int aux;
        if(inicio>fim){
            aux = inicio;
            inicio = fim;
            fim = aux;
            return true;
        }else{
            return false;   
        }
    }
    
    public String intervalo(){
        String intervalo = "";
        
        for(int i = inicio+1; i < fim; i++){
            intervalo += i+"|";
        }
                
        return intervalo;
    }
}
