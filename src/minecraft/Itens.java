/**
 * 
 */
package minecraft;

/**
 * @author guilherme.afranca1
 *
 */
public class Itens {

	/**
	 * construtor
	 */
	public Itens() {
		
	}

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		Enxada enxadaDiamante = new Enxada();
		enxadaDiamante.resistencia = 10;
		enxadaDiamante.textura = "Diamante";
		enxadaDiamante.conquista = false;
		System.out.println("Enxada de" + enxadaDiamante.textura);
		System.out.println("Resistencia" + enxadaDiamante.resistencia);
		enxadaDiamante.arar();
		if (enxadaDiamante.conquista = true) {
			System.out.println("____________________________________");
			System.out.println("Conqusta obtida!!");
			System.out.println("Dedicação séria. Hora do plantio");
			System.out.println("_____________________________________");			
		}
	}

}
