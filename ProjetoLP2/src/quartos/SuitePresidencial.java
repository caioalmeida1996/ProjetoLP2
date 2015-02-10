package quartos;

import java.util.Calendar;

/**
 * Classe Suite Presidencial
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public class SuitePresidencial extends Quarto {

	private static int capacidadeMaxima = 4;
	private static double valorDiaria = 1200;

	/**
	 * construtor da classe
	 * 
	 * @param dataInicial
	 *            A data inicial do aluguel do quarto.
	 * @param dataFinal
	 *            a data atual/final do aluguel do quarto.
	 * @param nomeDoHospede
	 *            O nome do responsável pelo quanrto.
	 */
	public SuitePresidencial(Calendar dataInicial, Calendar dataFinal,
			String nomeDoHospede) throws Exception {
		super(dataInicial, dataFinal, nomeDoHospede);
	}// fim do construtor

	// ----------------- Metodos Gets -------------------

	/**
	 * Retorna a capacidade maxima do respectivo quarto
	 * 
	 * @return int representando a capaciade max do quarto
	 */
	@Override
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	/**
	 * Recupera o valor monetario de uma diaria de aluguel em uma suite
	 * presidencial
	 * 
	 * @return O valor monetario da diaria
	 */
	@Override
	public double getValorDiaria() {
		return valorDiaria;
	}
	/**
	 * retorna o tipo de quarto
	 */
	@Override
	public String getTipoDeQuarto() {
		// TODO Auto-generated method stub
		return "Presidencial";
	}

}// fim da classe