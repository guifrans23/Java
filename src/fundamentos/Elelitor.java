/**
 * Fundamentos do java
 * Varialveis, Operador e estrutura de controle
 * exercicio 1 - App Eleitor
 *  Desenvolvimento de um APP no modo console que em função da idade do 
 eleitor avise se o voto é obrigatorio ou não
 * Abaixo de 16 anos = VOTO PROIBIDO
 * ENtre 18 e 70(Incluindo 16 e 70) - VOTO OBRIGATORIO
 * 16,17 ou acima de 70 - VOTO FACULTATIVO
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author guilherme.afranca1
 */
public class Elelitor {
	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// varivel
		int idade;
		// objeto
		Scanner teclado = new Scanner(System.in);
		System.out.println("APP ELEITOR ===================");
		System.out.println("Digite sua idade");
		// entrada
		idade = teclado.nextInt();
		// apoio ao teste do fluxo (Verificar Se A Idade Foi 
		//Capturada)
		// System.out.println(idade);
		//Processamento e saida
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade > 17 && idade < 71) {
			System.out.println("VOTO OBRIGATORIO");
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
		// encerrar a captura de dados
		teclado.close();
	}

}
