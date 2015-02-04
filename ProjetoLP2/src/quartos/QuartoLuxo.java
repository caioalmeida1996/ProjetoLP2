package quartos;

import java.util.Calendar;


public abstract class QuartoLuxo extends Quarto{
	private  int capacidadeMaxima;
	private  double valorDiaria;
	private boolean temCama;

	public QuartoLuxo(String tipoDoQuarto,Calendar dataInicial, Calendar dataFinal, String nomeDoHospede, boolean temCama)throws Exception {
		super(dataInicial, dataFinal, nomeDoHospede);
		System.out.println(tipoDoQuarto);
		if (tipoDoQuarto == "simples") {
			this.capacidadeMaxima = 1;
			this.valorDiaria = 520.00;
			this.temCama = temCama;
		}else if(tipoDoQuarto == "duplo"){
			this.capacidadeMaxima = 2;
			this.valorDiaria = 570.00;
			this.temCama = temCama;
		}else if (tipoDoQuarto == "triplo"){
			this.capacidadeMaxima = 3;
			this.valorDiaria = 620.00;
			this.temCama = false;
		}else{
			throw new Exception("erro, tipo de quarto invalido");
		}
		
		
	}
	

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
	
	
	
	public boolean isTemCama() {
		return temCama;
	}

	public void setTemCama(boolean temCama) {
		this.temCama = temCama;
	}


}