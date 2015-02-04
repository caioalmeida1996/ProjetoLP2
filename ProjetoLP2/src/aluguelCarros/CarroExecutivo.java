package aluguelCarros;

/**
 * Classe CarroExcecutivo
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public class CarroExecutivo extends AluguelCarro{
	private final double diaria = 60.00; // O valor da di�ria de aluguel de um carro executivo
	
	public CarroExecutivo(String placa, boolean temTanqueCheio, boolean temSeguro) {
		super(placa, temTanqueCheio, temSeguro);
	}

	@Override
	public double getDiaria() {
		return diaria;
	}
}// fim da classe
