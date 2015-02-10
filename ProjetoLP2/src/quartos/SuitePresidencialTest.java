package quartos;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class SuitePresidencialTest {
	private Calendar dataInicial;
	private	Calendar dataFinal;
	Quarto quarto1;
	
	@Before
	public void testSuitePresidencial() throws Exception {
		dataInicial = Calendar.getInstance();
		dataInicial.set(2015, 2, 9);
		dataFinal = Calendar.getInstance();
		dataFinal.set(2015, 2, 19);
		
		quarto1 = new SuitePresidencial(dataInicial, dataFinal, "heitor");
	}
	
	@Test
	public void testGetValorDiaria() {
		assertTrue(quarto1.getValorDiaria() == 1200.0);
	}

	@Test
	public void testGetCapacidadeMaxima() {
		assertTrue(quarto1.getCapacidadeMaxima() == 4);
	}

	@Test
	public void testGetTipoDeQuarto() {
		assertEquals(quarto1.getTipoDeQuarto(),"Presidencial");
	}

	

}
