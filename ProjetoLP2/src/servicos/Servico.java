package servicos;

import java.util.Calendar;

/**
 * Classe Servico
 * 
 * @author Alexandre, Heitor, Caio e Akylles. 
 *
 */
public abstract class Servico {
	
	private Calendar dataInicial; // a data em que o servico foi requisitado
	
	/**
	 * Configura o dia em que algum servico do hotel foi solicitado
	 * 
	 * @param data
	 * 			(Calendar) Um objeto que indica ano, mes, dia e hora em que um
	 * 			servico foi solicitado ao hotel
	 */
	public void setDataSolicitacao(Calendar data){
		this.dataInicial = data;
	}
	
	/**
	 * Recupera a data de solicitacao do servico
	 * 
	 * @return (Calendar) A data de solicitacao do servico
	 */
	public Calendar getDataSolicitacao() {
		return dataInicial;
	}

	/**
	 * Recupera o valor de custo de um servico solicitado
	 * 
	 * @return (double) o custo do servico.
	 */
	public abstract double custo();
	
}// fim da classe
