package quartos;

import java.util.Calendar;

public class QuartoLuxoDuplo extends QuartoLuxo{

	private static int capacidadeMaxima = 2;
	private static double valorDiaria = 570;
	
	public QuartoLuxoDuplo(Calendar dataInicial, Calendar dataFinal,
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
