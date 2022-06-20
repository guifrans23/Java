/**
 *  Fundamentos do java
 *  Gerador de numeros e caracteres aleatorios
 */
package fundamentos;

import java.util.Iterator;
import java.util.Random;

/**
 * @author guifrans
 *
 */
public class Numerosaleatoris {

	/**
	 * método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Uso da classe Random para gerar numeros aleatorios
		Random gerador = new Random();
		// exemplo 1
		// (100) gerador de numeros de 0 a 99
		int numero = gerador.nextInt(100);
		System.out.println(numero);
		// exemplo 2
		int dado = gerador.nextInt(6) + 1;
		System.out.println("Face do Dado " + dado);
		// exemplo 3
		String chassi = new String("123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.print("Chassi: * ");
		for (int i = 0; i < 16; i++) {
			// A linha a baixo cria um objeto que contem caracter
			// A linha abaixo cria uma variavel do tipo char que usa o objeto
			// gerador para gerar um numero aleatorio entre 0 e o tamanho maximo
			// de caracter do objeto chassi (.lenght() ->tamanho da String)
			// (char)converter o tipo int para o tipo char
			char numeracao = (char) gerador.nextInt(chassi.length());
			// A linha abaixo imprime o valor da variavel numero
			// (.charAt()-> Imprimir apenas 1 caracter)
			System.out.print(chassi.charAt(numeracao));
		}

		System.out.println(" *");
	}

}
