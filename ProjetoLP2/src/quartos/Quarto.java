package quartos;

import java.util.Calendar;



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

	/**
	 * 
	 * @param dataInicial A data inicial do aluguel do quarto.
	 * @param dataFinal a data atual/final do aluguel do quarto.
	 * @param nomeDoHospede O nome do responsável pelo quanrto.
	 */
	public Quarto(Calendar dataInicial,Calendar dataFinal,String nomeDoHospede){
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.nomeDoHospede = nomeDoHospede;
		
	}
	
	
	
  // -------------------metodos gets----------------
	
	/**
	 *  Retorna a data inicial do aluguel do quarto
	 * 
	 * @return retorna uma String com a o dia, o mês e o ano
	 */
	public String getDataInicial(){
		return ("Data Inicial:") + " " +
				(dataInicial.get(Calendar.DAY_OF_MONTH)) +"/" +
				(dataInicial.get(Calendar.MONTH)) + "/" +
				(+dataInicial.get(Calendar.YEAR));
		}
	
	
	/**
	 *  Retorna a data final do aluguel do quarto
	 * 
	 * @return retorna uma String com a o dia, o mês e o ano
	 */
		public String getDataFinal() {
			return  ("Data Final:") + " " +
					(dataFinal.get(Calendar.DAY_OF_MONTH)) +"/" +
					(dataFinal.get(Calendar.MONTH)) + "/" +
					(+dataFinal.get(Calendar.YEAR));
		}
	
		
	/**
	 * 
	 * @return O nome do hospede responsalvel pelo quarto
	 */
	public String getNomeDoHospide(){
		return nomeDoHospede;
	}
	
	
	/**
	 * Recupera a quantidade de dias em que o quarto esta/foi alugado.
	 * 
	 * @return (int) O numero de dias de aluguel do quarto.
	 */
	public int getNumeroDiasAluguel(){
		int quantidadeDeDias =  (int) (dataFinal.get(Calendar.DAY_OF_YEAR) -  dataInicial.get(Calendar.DAY_OF_YEAR));
		return quantidadeDeDias; //* 24 * 60 * 60 * 1000;
	}
	
	
	/**
	 * retorna o valor da diaria do respectivo quarto
	 * @return double com o valor da diaria.
	 */
	public double getValorDiaria() {
		return 0;
	}

	
	/**
	 *  Retorna a capacidade maxima do respectivo quarto
	 * @return int representando a capaciade max do quarto
	 */
	public int getCapacidadeMaxima() {
		return 0;
	}
	
	//-------------- metodos Sets-------------------

	/**
	 * Configura a data de inicio do aluguel de quarto.
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
	
	
	/**
	 *  calcula o valor do custo de hospedagem 
	 * @return um double contendo o valor da hospedagem.
	 */
	public double custo() {
		return getNumeroDiasAluguel() * getValorDiaria();
	}
	
	
	/*public void finalizarQuarto(){
		dataFinal = dataFinal.getInstance();
		//this.dataInicial = null;
		//this.dataFinal = null;
		//this.nomeDoHospede = null;
		
	}*/
	
	
}// fim da classe