package quartos;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class QuartoLuxoTest {
	private Calendar dataInicial;
	private	Calendar dataFinal;
	Quarto quarto1;
	Quarto quarto2;
	Quarto quarto3;
	
	
	@Before
	public void testQuartoLuxo() throws Exception {
		dataInicial = Calendar.getInstance();
		dataInicial.set(2015, 2, 9);
		dataFinal = Calendar.getInstance();
		dataFinal.set(2015, 2, 19);
		
		quarto1 = new QuartoLuxo("simples", dataInicial, dataFinal, "heitor", true);
		quarto2 = new QuartoLuxo("duplo", dataInicial, dataFinal, "akiles", false);
		quarto3 = new QuartoLuxo("triplo", dataInicial, dataFinal, "caio", true);
	}
	
	@Test
	public void testGetValorDiaria() {
		assertTrue(quarto1.getValorDiaria() == 520.0);
		assertTrue(quarto2.getValorDiaria() == 570.0);
		assertTrue(quarto3.getValorDiaria() == 620.0);
	}

	@Test
	public void testGetCapacidadeMaxima() {
		assertTrue(quarto1.getCapacidadeMaxima() == 1);
		assertTrue(quarto2.getCapacidadeMaxima() == 2);
		assertTrue(quarto3.getCapacidadeMaxima() == 3);
	}

	@Test
	public void testGetTipoDeQuarto() {
		assertEquals(quarto1.getTipoDeQuarto(),"simples");
		assertEquals(quarto2.getTipoDeQuarto(),"duplo");
		assertEquals(quarto3.getTipoDeQuarto(),"triplo");
	}


	public void testIsTemCamaExtra() {
		//quarto1.
	}

	
	public void testSetTemCama() {
		fail("Not yet implemented");
	}

}
