package smartphone.servico.aparelho_telefonico;

public class Chamadas implements AparelhoTelefonico{

	public void ligar(String numero) {
		
		System.out.println("Ligando para o número: " + numero);
	}
	
	public void atender() {
		
		System.out.println("Atendendo ligação ");
	}
	
	public void iniciarCorreioVoz() {
		
		System.out.println("Gravando uma mensagem no Correio de Voz");
	}
	
	
}
