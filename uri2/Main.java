package uri2;

public class Main {
    public static void main(String[] args) {
		
	Extrator ex = new Extrator("https://www.urionlinejudge.com.br/judge/en/profile/40980");
	System.out.println(ex.getHtml());
	}
}
