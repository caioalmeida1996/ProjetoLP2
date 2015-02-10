package aluguelCarros;

import java.util.Calendar;

import servicos.ServicoSuplementar;

/**
 * Classe Aluguel de Carro
 * 
 * @author Alexandre, Heitor, Caio e Akylles.@author AKYLLES
 *
 */
public abstract class AluguelCarro extends ServicoSuplementar {

	private static double valorTanqueCheio = 150.00; // O valor padrao eh 150,
														// mas pode ser alterado
														// de acordo com a
														// preferencia do
														// operador do programa
	
	private static double valorSeguro = 100.00; // O valor padrao eh 100, mas
												// pode ser alterado de acordo
												// com a preferencia do operador
												// do programa
	
	private String placa; // Uma referencia a uma placa de carro.
	private boolean temTanqueCheio; // Indica se o carro foi alugado com tanque
									// cheio ou nao
	private boolean temSeguro; // Indica se o carro foi alugado com seguro ou
								// nao
	private Calendar dataDevolucao; // a data em que o carro alugado foi
									// devolvido ao hotel

	/**
	 * Construtor da classe
	 * 
	 * @param temTanqueCheio
	 *            Um valor booleano que atesta se o carro foi alugado com o
	 *            tanque cheio
	 * @param temSeguro
	 *            Um valor booleano que atesta se o carro foi alugado com seguro
	 *            incluso
	 */
	public AluguelCarro(String placa, boolean temTanqueCheio, boolean temSeguro)throws Exception {
		super();
		if(placa == "" || placa == null ) throw new Exception("ERRO, o nome da placa não pode ser vaiza ou null.");
		this.temTanqueCheio = temTanqueCheio;
		this.temSeguro = temSeguro;
	}// fim do construtor

	// ----------------------metodos sets--------------------
	/**
	 * Configura o valor cobrado pelo aditivo tanque cheio
	 * 
	 * @param valorTanqueCheio
	 */
	public static void setValorTanqueCheio(double valorTanqueCheio) {
		AluguelCarro.valorTanqueCheio = valorTanqueCheio;
	}

	/**
	 * Configura o valor cobrado pelo seguro do carro
	 * 
	 * @param valorSeguro
	 */
	public static void setValorSeguro(double valorSeguro) {
		AluguelCarro.valorSeguro = valorSeguro;
	}

	/**
	 * Configura a data e hora em que o carro alugado foi devolvido ao hotel
	 * 
	 * @param dataFinal
	 *            (Calendar) A data de devolucao.
	 */
	public void setDataDevolucao(Calendar dataFinal) {
		this.dataDevolucao = dataFinal;
	}

	// -----------------------metodos gets----------------------------

	/**
	 * Recupera o valor adicional relacionado ao tanque cheio
	 * 
	 * @return o valor do tanque cheio.
	 */
	public static double getValorTanqueCheio() {
		return valorTanqueCheio;
	}

	/**
	 * Recupera o valor adicional relacionado ao seguro
	 * 
	 * @return o valor do seguro.
	 */
	public static double getValorSeguro() {
		return valorSeguro;
	}

	/**
	 * Recupera a placa do carro
	 * 
	 * @return a placa do carro
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * Recupera a data em que o carro foi devolvido.
	 * 
	 * @return Um objeto Calendar representando data e hora da devolucao.
	 */
	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	/**
	 * Recupera a quantidade de dias em que o carro foi alugado.
	 * 
	 * @return (int) O numero de dias de aluguel do carro.
	 */
	public int getNumeroDiasAluguel() {
		long dataInicial = super.getDataSolicitacao().getTimeInMillis(); // A
																			// data
																			// de
																			// solicitação
																			// em
																			// milisegundos
		
		long dataFinal = this.getDataDevolucao().getTimeInMillis(); // A data de
																	// devolução
																	// em
																	// milisegundos
		
		final int DIA_MILISEGUNDOS = 24 * 60 * 60 * 1000; // O valor
															// correspondente a
															// um dia em
															// milisegundos

		// Calcula a quantidade de dias em que o carro esteve alugado e atribui
		// o resultado a uma variavel
		int quantidadeDiasAluguel = ((int) ((dataFinal - dataInicial) / DIA_MILISEGUNDOS)) + 1;

		return quantidadeDiasAluguel;
	}

	/**
	 * Verifica se o carro foi alugado com tanque cheio
	 * 
	 * @return true = Foi alugado com tanque cheio false = Nao foi alugado com
	 *         tanque cheio
	 */
	public boolean temTanqueCheio() {
		return temTanqueCheio;
	}

	/**
	 * Verifica se o carro foi alugado com seguro incluso
	 * 
	 * @return true = Foi alugado com seguro false = Nao foi alugado com seguro
	 */
	public boolean temSeguro() {
		return temSeguro;
	}

	/**
	 * Recupera o valor dos aditivos tanque cheio e gasolina relacionados ao
	 * aluguel do carro.
	 * 
	 * @return (double) O valor dos aditivos.
	 */
	public double getAditivos() {
		if (temTanqueCheio && temSeguro) {
			return getValorTanqueCheio() + getValorSeguro();
		}
		if (temTanqueCheio) {
			return getValorTanqueCheio();
		}
		if (temSeguro) {
			return getValorSeguro();
		}
		return 0.0;
	}

	public abstract double getDiaria();

	@Override
	public double custo() {
		return this.getNumeroDiasAluguel() * this.getDiaria()
				+ this.getAditivos();
	}

}// final da classe
