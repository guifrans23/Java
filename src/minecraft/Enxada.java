/**
 * Poo - fundamentos
 */
package minecraft;

/**
 * @author guilherme.afranca1
 * classe mmodelo com herança(extends)
 */
public class Enxada  extends Bloco{

	/**
	 *  
	 */
	public Enxada() {
		System.out.println("_____CAMPO____");
	}
	//Atributo 
	boolean conquista;
	
	//método
	/**
	 * Método para arar a terra
	 */
	void arar() {
		System.out.println("terra preparada para "
	+ "o plantio");
	// atenção
		conquista = true;
	}
}
