package quartos;

import java.util.Calendar;

public class QuartoExecutivoSimples extends QuartoExecutivo{

	private boolean temCamaExtra;
	private static int capacidadeMaxima = 1;
	private static double valorDiaria = 520;
	
	public QuartoExecutivoSimples(Calendar dataInicial, Calendar dataFinal, boolean temCamaExtra) {
		super(dataInicial, dataFinal);
		this.temCamaExtra = temCamaExtra;
	}

	public boolean temCamaExtra() {
		return temCamaExtra;
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
