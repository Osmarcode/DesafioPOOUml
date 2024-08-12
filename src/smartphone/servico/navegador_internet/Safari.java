package smartphone.servico.navegador_internet;

public class Safari implements NavegadorInternet{
	
   public void exibirPagina(String url) {
		
		System.out.println("Acessando a Internet Site: " + url);
	}
	
	public void adicionarNovaAba() {
		
		System.out.println("Abrindo nova aba no navegador");
	}
	
	public void atualizarPagina() {
	
		System.out.println("Atualizando página");
	}

}
