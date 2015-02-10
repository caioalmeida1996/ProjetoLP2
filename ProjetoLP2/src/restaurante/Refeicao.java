package restaurante;

import servicos.Servico;

/**
 * Classe Refeicao
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public class Refeicao extends Servico{

	private double valorRefeicao;
	
	/**
	 * 
	 * @param valorRefeicao
	 * 			O valor da refeicao 
	 */
	public Refeicao(double valorRefeicao) throws Exception{
		super();
		if(valorRefeicao <= 0) throw new Exception("ERRO, o valor tem que ser positivo.");
		this.valorRefeicao = valorRefeicao;
	}

	@Override
	public double custo() {
		return this.valorRefeicao;
	}
	
}// fim da classe
