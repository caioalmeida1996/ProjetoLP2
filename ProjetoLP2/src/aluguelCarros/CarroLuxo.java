package aluguelCarros;

/**
 * Classe CarroLuxo
 * 
 * @author Alexandre, Heitor, Caio e Akylles.
 *
 */
public class CarroLuxo extends AluguelCarro{
	
	private final double DIARIA = 100.00; // O valor da di�ria de aluguel de um carro de luxo
	
	public CarroLuxo(String placa, boolean temTanqueCheio, boolean temSeguro) {
		super(placa, temTanqueCheio, temSeguro);
	}

	@Override
	public double getDiaria() {
		return DIARIA;
	}
	
}// fim da classe
