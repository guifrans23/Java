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

	// m�todos
	// void -> M�todo simples sem retorno
	/**
	 * M�todo usado para constru��o
	 */
	void construir() {
		System.out.println("Bloco colocado");
	}
	
	/**
	 * M�todo usado para obter recursos de minera��o
	 */
	void minerar() {
		System.out.println("Recursos obtidos");
	}

	/**
	 * M�todo usado para criar �tens
	 */
	void craftar() {
		System.out.println("�tem criado");
	}
}