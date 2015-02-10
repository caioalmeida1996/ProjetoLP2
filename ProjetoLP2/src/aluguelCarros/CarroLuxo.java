package aluguelCarros;

/**
 * Classe CarroLuxo
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public class CarroLuxo extends AluguelCarro {

	private final double DIARIA = 100.00; // O valor da di�ria de aluguel de
											// um carro de luxo

	/**
	 * CarroLuxo, Aluguel de um Carro Luxo
	 * 
	 * @param placa
	 *            , A Placa do Carro alugado.
	 * @param temTanqueCheio
	 *            , Se vira com tanque cheio ou n�o.
	 * @param temSeguro
	 *            , Se tera seguro ou n�o
	 * @throws Exception 
	 */
	public CarroLuxo(String placa, boolean temTanqueCheio, boolean temSeguro) throws Exception {
		super(placa, temTanqueCheio, temSeguro);
	}

	/**
	 * Pega o Valor da Diaria do carro
	 */
	@Override
	public double getDiaria() {
		return DIARIA;
	}

}
// fim da classe
