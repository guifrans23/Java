/**
 * POO - Encapsulamento e m�todos especiais
 */
package contas;

/**
 * @author guifrans
 *
 */
public class Conta {

	// Atributos
	// Para encapsular(proteger) uma vari�vel devemos usar o modificador private e criar m�todos espec�ficos (get e set) para outras classe e pacotes terem acesso �s vari�veis 
	// Encapsulamento - Passo 1: Modificador private
	private String cliente;
	private double saldo;
	
	/**
	 * Construtor
	 */
	public Conta() {
		System.out.println("----------------------");
		System.out.println("Ag�ncia 0261");
	}
	
	//Encapsulamento - Passo 2 Criar os m�todos espec�ficos (get e set) | Eclipse - bot�o direito do mouse - Source - Generate Getters and Setters - selecionar as vari�veis encapsuladas
	/**
	 * Ler o conte�do da vari�vel cliente
	 * @return cliente
	 */
	public String getCliente() {
		return cliente;
	}
	
	/**
	 * Setar(atribuir) um nome a vari�vel cliente
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * Obter o saldo do cliente
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Setar (atribuir) um valor a conta corrente
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//M�todos
	/**
	 * M�todo simples que exibe o valor do saldo
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	/**
	 * M�todo simples com uma variavel local
	 * para sacar um valor da conta
	 * @param valor
	 */
	protected void sacar (double valor) {
		saldo -= valor;
		System.out.println("Debito: R$ " + valor );
	}
	/**
	 * M�todo simples com uma variavel local
	 * para depositar um valor da conta
	 * @param valor
	 */
	protected void depositar (double valor) {
		saldo -= valor;
		System.out.println("Cr�dito R$ " + valor );
	}
	/**
	 * M�todo simples com uma variavel local e em um objeto 
	 * criado para indicar o destino da trasferencia do valor
	 * @param destino
	 * @param valor
	 */
	protected void transferir(Conta destino,double valor) {
		this.sacar(valor); 
		System.out.println("Transferencia: R$ " + valor);
	}
	/**
	 * Metodo com retorno obrigatorio da variavel com retorno
	 * @param cc1
	 * @param cc2
	 * @return
	 */
	double soma(double cc1,double cc2) {
		double total = cc1 + cc2;
		return total;
	}
}