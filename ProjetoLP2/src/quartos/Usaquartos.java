/**
 * 
 */
package quartos;

import java.util.Calendar;

/**
 * @author heitor
 *
 */
public class Usaquartos {
	private static Calendar a1 = Calendar.getInstance();
	private static Calendar a2 = Calendar.getInstance();
	private static Calendar a3 = Calendar.getInstance();
	private static Calendar a4 = Calendar.getInstance();
	

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//suite presidencial
		a2.set(Calendar.DAY_OF_YEAR,38);
		SuitePresidencial q1 = new SuitePresidencial(a1,a2,"heitor") {
		};
		
		// os quartos executivos
		a2.set(Calendar.DAY_OF_YEAR,48); // adiciona o dia 48 do ano
		QuartoExecutivo q2 = new QuartoExecutivo("simples",a1,a2,"heitor2",true) {
		}; 
		a3.set(Calendar.DAY_OF_YEAR,58);// adiciona o dia 58 do ano
		QuartoExecutivo q3 = new QuartoExecutivo("duplo",a2,a3,"heitor3",true) {
		}; 
		a4.set(Calendar.DAY_OF_YEAR,68);// adiciona o dia 68 do ano
		QuartoExecutivo q4 = new QuartoExecutivo("triplo",a3,a4,"heitor4",false) {
		}; 
		
		
		// os quartos de luxo
		a2.set(Calendar.DAY_OF_YEAR,48); // adiciona o dia 48 do ano
		QuartoLuxo q5 = new QuartoLuxo("simples",a1,a2,"heitor2",true) {
		}; 
		a3.set(Calendar.DAY_OF_YEAR,58);// adiciona o dia 58 do ano
		QuartoLuxo q6 = new QuartoLuxo("duplo",a2,a3,"heitor3",true) {
		}; 
		a4.set(Calendar.DAY_OF_YEAR,68);// adiciona o dia 68 do ano
		QuartoLuxo q7 = new QuartoLuxo("triplo",a3,a4,"heitor4",false) {
		}; 
		
		//testa presidencial
		System.out.println("nome do hospede:" + q1.getNomeDoHospide());
		System.out.println("data inicial:" + q1.getDataInicial());
		System.out.println("data final:" + q1.getDataFinal());
		System.out.println("N de dias de aluguel:" + q1.getNumeroDiasAluguel());
		System.out.println("valor da diaria:" + q1.getValorDiaria());
		System.out.println("capacidade maxima:" + q1.getCapacidadeMaxima());
		System.out.println("custo" + q1.custo());
		
		//testa os quartos executivos
		System.out.println("nome do hospede:" + q2.getNomeDoHospide());
		System.out.println("data inicial:" + q2.getDataInicial());
		System.out.println("data final:" + q2.getDataFinal());
		System.out.println("N de dias de aluguel:" + q2.getNumeroDiasAluguel());
		System.out.println("valor da diaria:" + q2.getValorDiaria());
		System.out.println("capacidade maxima:" + q2.getCapacidadeMaxima());
		System.out.println("custo" + q2.custo());
		//q1.finalizarQuarto();
		
		System.out.println("nome do hospede:" + q3.getNomeDoHospide());
		System.out.println("data inicial:" + q3.getDataInicial());
		System.out.println("data final:" + q3.getDataFinal());
		System.out.println("N de dias de aluguel:" + q3.getNumeroDiasAluguel());
		System.out.println("valor da diaria:" + q3.getValorDiaria());
		System.out.println("capacidade maxima:" + q3.getCapacidadeMaxima());
		System.out.println("custo" + q3.custo());
		
		System.out.println("nome do hospede:" + q4.getNomeDoHospide());
		System.out.println("data inicial:" + q4.getDataInicial());
		System.out.println("data final:" + q4.getDataFinal());
		System.out.println("N de dias de aluguel:" + q4.getNumeroDiasAluguel());
		System.out.println("valor da diaria:" + q4.getValorDiaria());
		System.out.println("capacidade maxima:" + q4.getCapacidadeMaxima());
		System.out.println("custo" + q4.custo());
		
		
		//testa os quartos luxos
		System.out.println("nome do hospede:" + q5.getNomeDoHospide());
		System.out.println("data inicial:" + q5.getDataInicial());
		System.out.println("data final:" + q5.getDataFinal());
		System.out.println("N de dias de aluguel:" + q5.getNumeroDiasAluguel());
		System.out.println("valor da diaria:" + q5.getValorDiaria());
		System.out.println("capacidade maxima:" + q5.getCapacidadeMaxima());
		System.out.println("custo" + q5.custo());
		
		System.out.println("nome do hospede:" + q6.getNomeDoHospide());
		System.out.println("data inicial:" + q6.getDataInicial());
		System.out.println("data final:" + q6.getDataFinal());
		System.out.println("N de dias de aluguel:" + q6.getNumeroDiasAluguel());
		System.out.println("valor da diaria:" + q6.getValorDiaria());
		System.out.println("capacidade maxima:" + q6.getCapacidadeMaxima());
		System.out.println("custo" + q6.custo());
		
		System.out.println("nome do hospede:" + q7.getNomeDoHospide());
		System.out.println("data inicial:" + q7.getDataInicial());
		System.out.println("data final:" + q7.getDataFinal());
		System.out.println("N de dias de aluguel:" + q7.getNumeroDiasAluguel());
		System.out.println("valor da diaria:" + q7.getValorDiaria());
		System.out.println("capacidade maxima:" + q7.getCapacidadeMaxima());
		System.out.println("custo" + q7.custo());
	
	
	}
	

}