package smartphone_apple;

import smartphone.servico.aparelho_telefonico.AparelhoTelefonico;
import smartphone.servico.navegador_internet.NavegadorInternet;
import smartphone.servico.reprodutor_musical.ReprodutorMusical;

public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	
	public void ligar(String numero) {
		
		System.out.println("Selecionando número: " + numero + " via smartphone");
	}
	
	public void atender() {
		
		System.out.println("Atendendo ligação via smartphone ");
	}
	
	public void iniciarCorreioVoz() {
		
		System.out.println("Gravando uma mensagem no Correio de Voz via smartphone");
	}

	
	 public void exibirPagina(String url) {
			
			System.out.println("Acessando a Internet via smartphone: " + url);
		}
		
		public void adicionarNovaAba() {
			
			System.out.println("Abrindo nova aba no navegador via smartphone");
		}
		
		public void atualizarPagina() {
		
			System.out.println("Atualizando página via smartphone");
		}

		
		public void tocar() {
			
			System.out.println("Tocando música via smartphone");
		}
		
		public void pausar() {
			
			System.out.println("Pausando música via smartphone");
		}
		
		public void selecionarMusica(String nome) {
			
			System.out.println("Selecionando música: " + nome + " via smartphone");
		}
	
}
