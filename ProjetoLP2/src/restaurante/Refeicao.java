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
	
	public Refeicao(double valorRefeicao) {
		super();
		this.valorRefeicao = valorRefeicao;
	}

	@Override
	public double custo() {
		return this.valorRefeicao;
	}
	
}// fim da classe
