package hotel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import hospede.Hospede;

import org.junit.Before;
import org.junit.Test;

import quartos.Quarto;
import quartos.QuartoExecutivo;
import quartos.QuartoLuxo;
import quartos.SuitePresidencial;
import servicos.Servico;
import contrato.Contrato;

public class HotelTest {
	private Hotel hotel1;
	
	private ArrayList<Contrato> contratos = new ArrayList<Contrato>(); 
	
	private ArrayList<Servico> servicos1 = new ArrayList<Servico>(); 
	private ArrayList<Servico> servicos2 = new ArrayList<Servico>(); 
	private ArrayList<Servico> servicos3 = new ArrayList<Servico>(); 
	private ArrayList<Servico> servicos4 = new ArrayList<Servico>(); 	
	
	private Contrato  contrato1;
	private Contrato  contrato2;
	private Contrato  contrato3;
	private Contrato  contrato4;
	
	private Hospede hospede1;
	private Hospede hospede2;
	private Hospede hospede3;
	private Hospede hospede4;
	
	private Quarto quarto1;
	private Quarto quarto2;
	private Quarto quarto3;
	private Quarto quarto4;
	
	
	
	@Before
	public void testHotel() throws Exception {
		hospede1 = new Hospede("heitor", "123.456.789", Calendar.getInstance(),"PE", "0000-00");
		hospede2 = new Hospede("Caio", "987.654.321", Calendar.getInstance(),"PB", "1111-00");
		hospede3 = new Hospede("Gullo", "246.135.795", Calendar.getInstance(),"SP","2222-00");
		hospede4 = new Hospede("Akiles", "246.135.876", Calendar.getInstance(),"CP","3333-00");
		
		quarto1 = new SuitePresidencial(Calendar.getInstance(), Calendar.getInstance(), hospede1.getNome());
		quarto2 = new QuartoExecutivo("simples", Calendar.getInstance(), Calendar.getInstance(), hospede2.getNome(), true);
		quarto3 = new QuartoLuxo("duplo", Calendar.getInstance(), Calendar.getInstance(), hospede3.getNome(), true);
		quarto4 = new QuartoLuxo("triplo", Calendar.getInstance(), Calendar.getInstance(), hospede4.getNome(), true);
		
		servicos1.add(quarto1);
		servicos2.add(quarto2);
		servicos3.add(quarto3);
		servicos4.add(quarto4);
		
		contrato1 = new Contrato(hospede1, Calendar.getInstance(), Calendar.getInstance(),servicos1);
		contrato2 = new Contrato(hospede2, Calendar.getInstance(), Calendar.getInstance(),servicos2);
		contrato3 = new Contrato(hospede3, Calendar.getInstance(), Calendar.getInstance(),servicos3);
		contrato4 = new Contrato(hospede4, Calendar.getInstance(), Calendar.getInstance(),servicos4);
		
		contratos.add(contrato1);
	
		hotel1 = new Hotel(contratos);
		
	}

	@Test
	public void testGetContratos() {
		System.out.println(hotel1.adicionaContrato(contrato2));
		System.out.println(hotel1.adicionaContrato(contrato3));
		System.out.println(hotel1.adicionaContrato(contrato4));
		System.out.println(hotel1.getContratos());
		System.out.println(hotel1.removeContrato(contrato1));
		System.out.println(hotel1.getContratos());
	}

	@Test
	public void testAdicionaContrato() {
		fail("Not yet implemented");
	}

	@Test
	public void testPesquisaContrato() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveContrato() {
		fail("Not yet implemented");
	}

}
