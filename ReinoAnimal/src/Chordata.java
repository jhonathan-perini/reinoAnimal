
public abstract class Chordata implements Reino { // classe abstrata não pode ser instanciada, utilizada para atributos
													// comuns aos herdeiros.

	private double x; // só pode ser acessado no escopo da classe. Não está disponível via herança

	protected String chordata() { // protected permite acesso via herança, private não
		return "Filo: Chordata\n" + "Subfilo: Vertebrata\n";
	}
}
