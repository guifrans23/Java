/**
 * Seguros
 */
package seguros;

import contas.Conta;

/**
 * @author guifrans
 *
 */
public class Seguropessoafisica extends Conta {

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		//Cliente 3
		//Usando o modificador protected devemos usar a própria herança (SeguroPessoaFisica) para criar o objeto
		Seguropessoafisica cc3 = new Seguropessoafisica();
		cc3.setCliente("Robson Vaamonde");
		cc3.setSaldo(9000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
	}

}