/**
 * poo - Modelo do carro
 */
package carros;
/**
 * 
 * @author guilherme.afranca1
 *
 */

public class Modelo {

	/**
	 * modelo principal
	 * @parm args
	 */
	public class carro {	
		
		/**
		 * Constutor
		 */
		public carro() {
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
		void modelo() {
			System.out.println("criar modelo");
		}
		
		/**
		 * M�todo usado para criar �tens
		 */
		void rodas() {
			System.out.println(" criar roda ");
		}
		void portas() {
			System.out.println(" criar portas ");
		}
		void janelas() {
			System.out.println(" criar janelas ");
		}
		
	}
}
