package quartos;

import java.util.Calendar;

public class QuartoLuxoTriplo extends QuartoLuxo{

	private static int capacidadeMaxima = 3;
	private static double valorDiaria = 620;
	
	public QuartoLuxoTriplo(Calendar dataInicial, Calendar dataFinal,
			boolean temCamaExtra) {
		super(dataInicial, dataFinal, temCamaExtra);
	}

	public static int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public static double getValorDiaria() {
		return valorDiaria;
	}

	@Override
	public double custo() {
		return super.getNumeroDiasAluguel() * getValorDiaria();
	}

}
