package hospede;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class HospedeTest {
	
	private Hospede hospede1;
	private Hospede hospede2;
	private Hospede hospede3;

	@Before
	public void criaHospedes() throws Exception {
		hospede1 = new Hospede("heitor", "123.456.789", Calendar.getInstance(),"PE", "0000-00");
		hospede2 = new Hospede("Caio", "987.654.321", Calendar.getInstance(),"PB", "1111-00");
		hospede3 = new Hospede("Gullo", "246.135.795", Calendar.getInstance(),"SP","2222-00");
		
	}

	
	@Test
	public void testGetNumeroDoCartao() {
		assertEquals(hospede1.getNumeroDoCartao(),"0000-00");
		assertEquals(hospede2.getNumeroDoCartao(),"1111-00");
		assertEquals(hospede3.getNumeroDoCartao(),"2222-00");
		
	}

	@Test
	public void testGetDataDeNacimento() {
		assertEquals(hospede1.getDataDeNacimento().DAY_OF_YEAR ,Calendar.getInstance().DAY_OF_YEAR);
		assertEquals(hospede2.getDataDeNacimento().DAY_OF_YEAR ,Calendar.getInstance().DAY_OF_YEAR);
		assertEquals(hospede3.getDataDeNacimento().DAY_OF_YEAR ,Calendar.getInstance().DAY_OF_YEAR);
	}

	@Test
	public void testGetNome() {
		assertEquals(hospede1.getNome(),"heitor");
		assertEquals(hospede2.getNome(),"Caio");
		assertEquals(hospede3.getNome(),"Gullo");
	}

	@Test
	public void testGetCpf() {
		assertEquals(hospede1.getCpf(),"123.456.789");
		assertEquals(hospede2.getCpf(),"987.654.321");
		assertEquals(hospede3.getCpf(),"246.135.795");
	}

	@Test
	public void testGetEndereco() {
		assertEquals(hospede1.getEndereco(),"PE");
		assertEquals(hospede2.getEndereco(),"PB");
		assertEquals(hospede3.getEndereco(),"SP");
	}

}
