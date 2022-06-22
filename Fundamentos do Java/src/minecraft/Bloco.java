/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author guifrans
 */
public class Bloco {	
	
	/**
	 * Constutor
	 */
	public Bloco() {
		super();
		System.out.println("-----------------------------");
	}

	// atributos
	int resistencia;
	String textura;

	// métodos
	// void -> Método simples sem retorno
	/**
	 * Método usado para construção
	 */
	void construir() {
		System.out.println("Bloco colocado");
	}
	
	/**
	 * Método usado para obter recursos de mineração
	 */
	void minerar() {
		System.out.println("Recursos obtidos");
	}

	/**
	 * Método usado para criar ítens
	 */
	void craftar() {
		System.out.println("Ítem criado");
	}
}