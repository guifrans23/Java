/**
 * Poo - fundamentos
 */
package minecraft;

/**
 * @author guilherme.afranca1
 * classe mmodelo com heran�a(extends)
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
	
	//m�todo
	/**
	 * M�todo para arar a terra
	 */
	void arar() {
		System.out.println("terra preparada para "
	+ "o plantio");
	// aten��o
		conquista = true;
	}
}
