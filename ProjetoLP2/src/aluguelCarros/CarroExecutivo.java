package aluguelCarros;

/**
 * Classe CarroExcecutivo
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public class CarroExecutivo extends AluguelCarro {
	private final double diaria = 60.00; // O valor da di�ria de aluguel de um
											// carro executivo

	/**
	 * CarroExecutivo, Aluguel de um Carro Executivo
	 * 
	 * @param placa
	 *            , A Placa do Carro alugado.
	 * @param temTanqueCheio
	 *            , Se vira com tanque cheio ou n�o.
	 * @param temSeguro
	 *            , Se tera seguro ou n�o.
	 * @throws Exception 
	 */
	public CarroExecutivo(String placa, boolean temTanqueCheio, boolean temSeguro) throws Exception {
		super(placa, temTanqueCheio, temSeguro);
	}

	/**
	 * Pega o Valor da Diaria do carro
	 */
	@Override
	public double getDiaria() {
		return diaria;
	}
}
// fim da classe
