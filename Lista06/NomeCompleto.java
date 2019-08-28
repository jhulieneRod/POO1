package Lista06;

public class NomeCompleto {
    
    private String nome, sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String nomeCompleto(){
        String nomeCompleto = nome+" "+sobrenome;
        
        return nomeCompleto;
    }
}
