package uri2;

public class Usuario {
        private String nome;
	private String posicao;
	private String pais;
	private String universidade;
	private String tempo;
	private String pontos;
	private String resolvidos;
	private String tentado;
	private String submissoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getPontos() {
        return pontos;
    }

    public void setPontos(String pontos) {
        this.pontos = pontos;
    }

    public String getResolvidos() {
        return resolvidos;
    }

    public void setResolvidos(String resolvidos) {
        this.resolvidos = resolvidos;
    }

    public String getTentado() {
        return tentado;
    }

    public void setTentado(String tentado) {
        this.tentado = tentado;
    }

    public String getSubmissoes() {
        return submissoes;
    }

    public void setSubmissoes(String submissoes) {
        this.submissoes = submissoes;
    }
    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [Nome=");
		builder.append(nome);
		builder.append(", PosiÃ§Ã£o=");
		builder.append(posicao);
		builder.append(", PaÃ­s=");
		builder.append(pais);
		builder.append(", Universidade=");
		builder.append(universidade);
		builder.append(", Data de Cadastro=");
		builder.append(tempo);
		builder.append(", Pontos=");
		builder.append(pontos);
		builder.append(", Resolvidos=");
		builder.append(resolvidos);
		builder.append(", Tentado=");
		builder.append(tentado);
		builder.append(", SubmissÃµes=");
		builder.append(submissoes);
		builder.append("]");
		return builder.toString();
	}
}
