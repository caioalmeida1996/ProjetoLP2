package babysitter;

import java.util.Calendar;

import servicos.ServicoSuplementar;


/**
 * Classe Babysitter
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public class Babysitter extends ServicoSuplementar{

	private Calendar dataFinalizacao;  // Armazena a data e hora da finalizacao do servico de babysitter
	
	/**
	 * Configura a data e hora do fim da prestacao do servico de babysitter
	 * 
	 * @param dataFinal
	 * 			(Calendar) A data e hora do fim da prestacao do servico de babysiter.
	 */
	public void setDataFinalizacao(Calendar dataFinal){
		this.dataFinalizacao = dataFinal;
	}
	
	/**
	 * Recupera a data e hora do fim da prestacao do servico de babysiter
	 * 
	 * @return A data e a hora do fim da prestacao do servico de babysiter
	 */
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	/**
	 * Calcula a quantidade de horas em que uma crianca foi deixada sob os
	 * auspicios do servico de babysitter.
	 * 
	 * @return (int) A quantidade de horas de tutela.
	 */
	public int getNumeroHoras(){
		long horaInicial = super.getDataSolicitacao().getTimeInMillis();  // Conversao da data inicial para milisegundos
		long horaFinal = this.getDataFinalizacao().getTimeInMillis();     // Conversao da data final para milisegundos
		final int HORA_MILISEGUNDOS = 60 * 60 * 1000;                     // Conversao de uma hora para milisegundos
		
		int quantidadeHoras = (int) ((horaFinal - horaInicial) / HORA_MILISEGUNDOS);
		return quantidadeHoras;
	}

	@Override
	public double custo() {
		int somador = 0;  // somador dos valores de todas as horas de babysitter 
		
		int horaInicial = super.getDataSolicitacao().get(Calendar.HOUR_OF_DAY); // ponto de partida do contador do for.
		
		for (int i = horaInicial; i < horaInicial + this.getNumeroHoras(); i++){
			int horaCorrente = i - 24 * (i / 24);
			
			if (horaCorrente >= 7 && horaCorrente < 18){
				somador += 25;
			}else{
				somador += 50;
			}
		}// fim do for
		
		return somador;
	}// fim do metodo custo()
	
}// fim da classe