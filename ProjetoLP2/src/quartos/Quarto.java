package quartos;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import servicos.ServicoTrivial;

/**
 * Classe Quarto
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public abstract class Quarto extends ServicoTrivial{

	private Calendar dataInicial; // A data do inicial do aluguel de quarto
	private Calendar dataFinal; // A data do final do aluguel de quarto
	private String nomeDoHospede; // O nome do hospede responsalvel pelo quarto

	/**
	 * 
	 * @param dataInicial
	 *            A data inicial do aluguel do quarto.
	 * @param dataFinal
	 *            a data atual/final do aluguel do quarto.
	 * @param nomeDoHospede
	 *            O nome do responsável pelo quanrto.
	 */
	public Quarto(Calendar dataInicial, Calendar dataFinal, String nomeDoHospede)throws Exception {
		if(nomeDoHospede == "" || nomeDoHospede == null) throw new Exception("ERROR, o nome do hospede nao pode ser null ou vazio.");
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.nomeDoHospede = nomeDoHospede;
	}

	// ------------------- Metodos gets ----------------

	/**
	 * Retorna a data inicial do aluguel do quarto
	 * 
	 * @return retorna um obj calendar representando a data.
	 */
	public Calendar getDataInicial() {
		return dataInicial;
	}

	/**
	 * Retorna a data final do aluguel do quarto
	 * 
	 * @return retorna um obj calendar representando a data.
	 */
	public Calendar getDataFinal() {
		return dataFinal;
	}

	/**
	 * 
	 * @return O nome do hospede responsalvel pelo quarto
	 */
	public String getNomeDoHospide() {
		return nomeDoHospede;
	}

	/**
	 * Recupera a quantidade de dias em que o quarto esta/foi alugado.
	 * 
	 * @return (int) O numero de dias de aluguel do quarto.
	 */
	public int getNumeroDiasAluguel() {
		int quantidadeDeDias = (int) (dataFinal.get(Calendar.DAY_OF_YEAR) - dataInicial
				.get(Calendar.DAY_OF_YEAR));
		return quantidadeDeDias; // * 24 * 60 * 60 * 1000;
	}

	/**
	 * retorna o valor da diaria do respectivo quarto
	 * 
	 * @return double com o valor da diaria.
	 */
	public double getValorDiaria() {
		return 0;
	}

	/**
	 * Retorna a capacidade maxima do respectivo quarto
	 * 
	 * @return int representando a capaciade max do quarto
	 */
	public int getCapacidadeMaxima() {
		return 0;
	}

	
	public abstract String getTipoDeQuarto();
	
	// -------------- Metodos Sets -------------------

	/**
	 * Configura a data de inicio do aluguel de quarto.
	 * 
	 * @param dataInicial
	 *            (Calendar) A data do inicio do aluguel de quarto.
	 */
	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial.set(Calendar.DAY_OF_YEAR,
				dataInicial.get(Calendar.DAY_OF_YEAR));
	}

	/**
	 * Configura a data do fim do aluguel de quarto.
	 * 
	 * @param dataFinal
	 *            (Calendar) A data do fim do aluguel de quarto.
	 */
	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal.set(Calendar.DAY_OF_YEAR,
				dataFinal.get(Calendar.DAY_OF_YEAR));
	}

	/**
	 * calcula o valor do custo de hospedagem
	 * 
	 * @return um double contendo o valor da hospedagem.
	 */
	@Override
	public double custo() {
		return getNumeroDiasAluguel() * getValorDiaria();
	}

	@Override
	public String toString() {
		String strdate1 = null;
		String strdate2 = null;

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		if (dataInicial != null) {
		strdate1 = sdf.format(dataInicial.getTime());
		}	
		if (dataFinal!= null) {
			strdate2 = sdf.format(dataFinal.getTime());
			}
		
		return  "Servico Quarto:" +
				",data Inicial do aluguel = " + strdate1 +
				", data Final do aluguel ="+ strdate2 +
				", nome Do Hospede = " + nomeDoHospede;
	}

	/*
	 * public void finalizarQuarto(){ dataFinal = dataFinal.getInstance();
	 * //this.dataInicial = null; //this.dataFinal = null; //this.nomeDoHospede
	 * = null;
	 * 
	 * }
	 */

}// fim da classe