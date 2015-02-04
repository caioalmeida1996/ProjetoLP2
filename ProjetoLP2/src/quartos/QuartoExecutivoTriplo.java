package quartos;

import java.util.Calendar;

public class QuartoExecutivoTriplo extends QuartoExecutivo{

	private static int capacidadeMaxima = 3;
	private static double valorDiaria = 20;
	
	public QuartoExecutivoTriplo(Calendar dataInicial, Calendar dataFinal) {
		super(dataInicial, dataFinal);
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
