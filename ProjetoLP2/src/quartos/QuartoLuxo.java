package quartos;

import java.util.Calendar;

public abstract class QuartoLuxo extends Quarto {
	private int capacidadeMaxima;
	private double valorDiaria;
	private boolean temCamaExtra;

	/**
	 * Construtor da Classe QuartoExecutivo
	 * 
	 * @param tipoDoQuarto
	 *            o tipo de quarto que será criado, "simpes","duplo","triplo".
	 * @param dataInicial
	 *            A data inicial do aluguel do quarto.
	 * @param dataFinal
	 *            a data atual/final do aluguel do quarto.
	 * @param nomeDoHospede
	 *            O nome do responsável pelo quanrto.
	 * @param temCamaExtra
	 *            Informa se no quarto haverá ou não cama extra.
	 * @throws Exception
	 *             as devidas exceções.
	 */
	public QuartoLuxo(String tipoDoQuarto, Calendar dataInicial,
			Calendar dataFinal, String nomeDoHospede, boolean temCamaExtra)
			throws Exception {
		/*
		 * os quartos são divididos em 3 tipos,"simpes","duplo","triplo". para
		 * cada um valor de diaria e de capacidade maxima deve ser ser diferente
		 * , as condicoes abaixo servem pra criar os 3 tipos de quarto sem a
		 * necessidade de cirar varias outras subclasses reduzindo assim a
		 * quantidade de linhas e a repeticao de codigos
		 */
		super(dataInicial, dataFinal, nomeDoHospede);
		if (tipoDoQuarto == "simples") {
			this.capacidadeMaxima = 1;
			this.valorDiaria = 520.00;
			this.temCamaExtra = temCamaExtra;
		} else if (tipoDoQuarto == "duplo") {
			this.capacidadeMaxima = 2;
			this.valorDiaria = 570.00;
			this.temCamaExtra = temCamaExtra;
		} else if (tipoDoQuarto == "triplo") {
			this.capacidadeMaxima = 3;
			this.valorDiaria = 620.00;
			this.temCamaExtra = false;
		} else {
			throw new Exception("erro, tipo de quarto invalido");
		}

	}

	// ---------- Metodos Gets ------------------

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
	 * Recupera o valor monetario de uma diaria de aluguel no quarto Luxo.
	 * 
	 * @return O valor monetario da diaria
	 */
	@Override
	public double getValorDiaria() {
		return valorDiaria;
	}

	/**
	 * retorna o tipo de quarto
	 * 
	 * @return uma string representando o tipo de quarto.
	 */
	public String getTipoDeQuarto() {
		/*
		 * se a capaciade maxima do quarto for 1 ele é do tipo "simples", se
		 * for 2 é do tipo "duplo", se for 3 "triplo".
		 */
		if (capacidadeMaxima == 1) {
			return "simples";
		} else if (capacidadeMaxima == 2) {
			return "duplo";
		} else {
			return "triplo";
		}
	}

	/**
	 * diz se o quarto possui ou não cama
	 * 
	 * @return um boolean indicando se possui ou não cama no quarto.
	 * 
	 */
	public boolean isTemCamaExtra() {
		return temCamaExtra;
	}

	// ------------------- Metodos Sets ----------------

	/**
	 * 
	 * @param temCama
	 *            recebe um boolean de configuração da cama
	 * @return Um boolean indicando se o quarto possui ou não a cama
	 * 
	 */
	public boolean setTemCama(boolean temCama) {
		/*
		 * se a cama for do tipo "triplo" ela não pode ter cama extra
		 */
		if (getTipoDeQuarto() == "triplo") {
			this.temCamaExtra = false;
			return isTemCamaExtra();
		}
		this.temCamaExtra = temCama;
		return isTemCamaExtra();

	}

}