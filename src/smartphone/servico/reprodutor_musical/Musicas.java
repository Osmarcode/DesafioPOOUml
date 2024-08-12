package smartphone.servico.reprodutor_musical;

public class Musicas implements ReprodutorMusical{
	
	public void tocar() {
		
		System.out.println("Tocando música");
	}
	
	public void pausar() {
		
		System.out.println("Pausando música");
	}
	
	public void selecionarMusica(String nome) {
		
		System.out.println("Selecionando música: " + nome);
	}

}