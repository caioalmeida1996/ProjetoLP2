package quartos;

import java.util.Calendar;

public class QuartoLuxoSimples extends QuartoLuxo{

	private static int capacidadeMaxima = 1;
	private static double valorDiaria = 520;
	
	public QuartoLuxoSimples(Calendar dataInicial, Calendar dataFinal,
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
