package uri2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

public class Extrator {
	private String url;
	private String html;
	Usuario usuario = new Usuario();
	
	public String getHtml() {
		return html;
	}

	public void setHtml() {
		this.html = retornaHtml();
	}

	public String getUrl() {
		return url;
	}
	
	public Extrator(String url) {
		setUrl(url);
		setHtml();
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String retornaHtml () {
		String qualquer = null;
		int TAM = 50;
		String array[] = new String[TAM];
		String array2[] = new String[TAM];
		try {         
                        URL url = new URL(this.url);         
			URI uri = url.toURI(); 
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));          
			String s;  
			int cont = 0;
			//105 linhas diferenÃ§a
			while ((s = br.readLine()) != null) { 
				
				if (cont == 139) {
					array = s.split(">");
					array2 = array[1].split("</");
					usuario.setNome(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 146) {
					array = s.split("                ");
					array2 =array[1].split("            </li>");
					if(array2[0].equals("Desconhecido")) {
						usuario.setPosicao(array2[0]);}
					else {
						array = s.split("                ");
						array2 =array[1].split("&ordm;            </li>");
						usuario.setPosicao(array2[0]);
					}
					qualquer = qualquer+"\n" + s;
					}
				
				
				if (cont == 149) {
					array2 =s.split("</li>");
					if(array2[0].equals("                -            ")) {
						array2 = array2[0].split("                ");
						array2 = array2[1].split("            ");
						usuario.setPais(array2[0]);}
					else {
						array = s.split(">");
						array2 =array[1].split("</");
						usuario.setPais(array2[0]);
					}
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 152) {
					array = s.split("'name'>");
					array2 =array[1].split("</");
					if(array2[0].equals("'name'><")) {
						usuario.setUniversidade("Desconhecido");}
					else {
						usuario.setUniversidade(array2[0]);
					}
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 155) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					usuario.setTempo(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 158) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					usuario.setPontos(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 161) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					usuario.setResolvidos(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 164) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					usuario.setTentado(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
				if (cont == 167) {
					array = s.split("                ");
					array2 =array[1].split("            </");
					usuario.setSubmissoes(array2[0]);
					qualquer = qualquer+"\n" + s;
					}
				
			  cont++;
			}
			
			br.close();      
			} 
		catch (MalformedURLException excecao) {          
			} 
		catch (URISyntaxException | IOException excecao) {          
			}
		return qualquer;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Url [url=");
		builder.append(url);
		builder.append("]\n");
		builder.append(usuario.toString()); 
		return builder.toString();
	}
}
