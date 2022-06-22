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

		// métodos
		// void -> Método simples sem retorno
		/**
		 * Método usado para construção
		 */
		void modelo() {
			System.out.println("criar modelo");
		}
		
		/**
		 * Método usado para criar ítens
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
