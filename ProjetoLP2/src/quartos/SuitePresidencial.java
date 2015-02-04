package quartos;

import java.util.Calendar;

/**
 * Classe Suite Presidencial
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public class SuitePresidencial extends Quarto{

	private static int capacidadeMaxima = 4;
	private static double valorDiaria = 1200;
	
	/**
	 * Construtor da classe
	 * 
	 * @param dataInicial
	 * 			(Calendar) A data de inicio do aluguel da suite
	 * @param dataFinal
	 * 			(Calendar) A data de fim do aluguel da suite
	 */
	public SuitePresidencial(Calendar dataInicial, Calendar dataFinal, String nomeDoHospede) throws Exception{
		super(dataInicial, dataFinal, nomeDoHospede);		
	}// fim do construtor

	@Override
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	
	/**
	 * Recupera o valor monetario de uma diaria de aluguel em uma suite presidencial
	 * 
	 * @return O valor monetario da diaria
	 */
	@Override
	public double getValorDiaria() {
		return valorDiaria;
	}
	

}// fim da classe