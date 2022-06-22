/**
 * 
 */
package fundamentos;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author guilherme.afranca1
 *
 */
public class Tabuada {

	/**
	 * construtor
	 */
	public Tabuada() {
		
	}

	/**
	 * método principal
	 * @param args
	 */
	public static void main(String[] args) {
		//variavel
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("------------Tabuada---------");
		System.out.println("Digite o valor da tabuada");
		//entrada
		valor = teclado.nextInt();
		System.out.println("Tabuada do" + valor);
		System.out.println(" ");
		//processamento/saida
		for (int i = 1; i < 11;i++) {
			System.out.println(valor + " X " + i + (valor * i));
		}
		teclado.close();
		} 

		

	}


