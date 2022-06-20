/**
 * 
 */
package carros;

/**
 * @author guilherme.afranca1
 *
 */
public class Carro {
	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {

		String nome = "mercedes-Amg classe E sedan";
		int idade = 2;
		String marca = "mercedes";
		double preco = 555.900;
		boolean arCondicionado = false;
		System.out.println("nome:" + nome);
		System.out.println("idade:" + idade);
		System.out.println("marca:" + marca);
		System.out.println("preco:" + preco);
		System.out.println("Ar Condicionado Ligado ?:" + arCondicionado);
		
		String chassi = new String("123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.print("Chassi: * ");
		for (int i = 0; i < 16; i++) {
			Object gerador;
			char numeracao = (char) gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));
		}

		System.out.println(" *");
	}
}