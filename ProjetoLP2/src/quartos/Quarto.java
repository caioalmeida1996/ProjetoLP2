package quartos;

import java.util.Calendar;

import servicos.ServicoTrivial;

/**
 * Classe Quarto
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public abstract class Quarto{

	private Calendar dataInicial;  // A data do inicial do aluguel de quarto
	private Calendar dataFinal;    // A data do final do aluguel de quarto
	private String nomeDoHospede; // O nome do hospede responsalvel pelo quarto

	
	public Quarto(Calendar dataInicial,Calendar dataFinal,String nomeDoHospede){
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.nomeDoHospede = nomeDoHospede;
		
	}
	
	
	
  // metodos gets
	
	/**
	 * Recupera a data do fim do aluguel de quarto.
	 * 
	 * @return (Calendar) A data do fim do aluguel de quarto.
	 */
	public String getDataFinal() {
		return  ("Data Final:") + " " +
				(dataFinal.get(Calendar.DAY_OF_MONTH)) +"/" +
				(dataFinal.get(Calendar.MONTH)) + "/" +
				(+dataFinal.get(Calendar.YEAR));
	}

	/**
	 * 
	 * @return a data inicial da realizacao do contrato
	 */
	public String getDataInicial(){
		return ("Data Inicial:") + " " +
				(dataInicial.get(Calendar.DAY_OF_MONTH)) +"/" +
				(dataInicial.get(Calendar.MONTH)) + "/" +
				(+dataInicial.get(Calendar.YEAR));
		
		


	}
	
	/**
	 * 
	 * @return O nome do hospede responsalvel pelo quarto
	 */
	public String getNomeDoHospide(){
		return nomeDoHospede;
	}
	
	
	/**
	 * Recupera a quantidade de dias em que o quarto foi(esta) alugado.
	 * 
	 * @return (int) O numero de dias de aluguel do quarto.
	 */
	public int getNumeroDiasAluguel(){
		int quantidadeDeDias =  (int) (dataFinal.get(Calendar.DAY_OF_YEAR) -  dataInicial.get(Calendar.DAY_OF_YEAR));
		return quantidadeDeDias; //* 24 * 60 * 60 * 1000;
	}
	
	public double getValorDiaria() {
		return 0;
	}

	public int getCapacidadeMaxima() {
		return 0;
	}
	
	// metodos Sets

	/**
	 * Configura a data de inicio do aluguel de quarto.
	 * @param dataInicial 
	 * 
	 * @param dataInicial
	 *			(Calendar) A data do inicio do aluguel de quarto.
	 */
	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial.set(Calendar.DAY_OF_YEAR, dataInicial.get(Calendar.DAY_OF_YEAR));
	}
	
	/**
	 * Configura a data do fim do aluguel de quarto.
	 * 
	 * @param dataFinal
	 *			(Calendar) A data do fim do aluguel de quarto.
	 */
	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal.set(Calendar.DAY_OF_YEAR, dataFinal.get(Calendar.DAY_OF_YEAR));
	}
	
	public double custo() {
		return getNumeroDiasAluguel() * getValorDiaria();
	}
	
	
	public void finalizarQuarto(){
		dataFinal = dataFinal.getInstance();
		//this.dataInicial = null;
		//this.dataFinal = null;
		//this.nomeDoHospede = null;
		
	}
	
	
}// fim da classe