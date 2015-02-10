package contrato;

import static org.junit.Assert.*;
import hospede.Hospede;

import java.util.ArrayList;
import java.util.Calendar;


import org.junit.Before;
import org.junit.Test;

import quartos.Quarto;
import quartos.QuartoExecutivo;
import quartos.SuitePresidencial;
import servicos.Servico;

public class ContratoTest {
	private ArrayList<Servico> servicos1 = new ArrayList<Servico>(); 
	private ArrayList<Servico> servicos2 = new ArrayList<Servico>(); 
	private ArrayList<Servico> servicos3 = new ArrayList<Servico>(); 
	
	Contrato contrato1;
	Contrato contrato2;

	Hospede hospede1;
	Hospede hospede2;	
	
	private Quarto quarto1;
	private Quarto quarto2;
	
	private Calendar dataInicial;
	private	Calendar dataFinal;

	@Before
	public void testContrato() throws Exception {
		dataInicial = Calendar.getInstance();
		dataInicial.set(2015, 2, 9);
		dataFinal = Calendar.getInstance();
		dataFinal.set(2015, 2, 19);

		hospede1 = new Hospede("heitor", "111111", Calendar.getInstance(), "aabb", "09877");
		hospede2 = new Hospede("caio", "111112", Calendar.getInstance(), "aabb2", "09878");
		
		quarto1 = new SuitePresidencial(dataInicial, dataFinal, hospede1.getNome());
		quarto2 = new QuartoExecutivo("simples", dataInicial, dataFinal, hospede2.getNome(), true);
		
		servicos1.add(quarto1);
		servicos2.add(quarto2);
		servicos3.add(quarto1);
		servicos3.add(quarto2);
		
		contrato1 = new Contrato(hospede1, dataInicial, dataFinal, servicos1);
		contrato2 = new Contrato(hospede2, dataInicial, dataFinal, servicos2);
		
	}

	@Test
	public void testSetHospede() {
		contrato1.setHospede(hospede2);
		assertTrue(contrato1.getHospede().equals(hospede2));
		
		contrato2.setHospede(hospede1);
		assertTrue(contrato2.getHospede().equals(hospede1));
	}

	@Test
	public void testSetDataInicial() {
		contrato1.setDataInicial(dataFinal);
		assertTrue(contrato1.getDataFinal() == contrato1.getDataInicial());
		
		contrato2.setDataInicial(dataFinal);
		assertTrue(contrato2.getDataFinal() == contrato2.getDataInicial());
	}

	@Test
	public void testSetDataFinal() {
		contrato1.setDataFinal(dataInicial);
		assertTrue(contrato1.getDataFinal() == contrato1.getDataInicial());
		
		contrato2.setDataFinal(dataInicial);
		assertTrue(contrato2.getDataFinal() == contrato2.getDataInicial());
	}

	@Test
	public void testSetServicos() {
		contrato1.setServicos(servicos3);
		contrato2.setServicos(servicos3);
		assertTrue(contrato1.getServicos().size() == 2);
		assertTrue(contrato2.getServicos().size() == 2);
	}

	@Test
	public void testGetHospede() {
		assertTrue(contrato1.getHospede().getNome() == hospede1.getNome());
		assertTrue(contrato2.getHospede().getNome() == hospede2.getNome());
	}

	@Test
	public void testGetDataInicial() {
		assertEquals(contrato1.getDataInicial(), dataInicial);
		assertEquals(contrato2.getDataInicial(), dataInicial);
		
	}

	@Test
	public void testGetDataFinal() {
		assertEquals(contrato1.getDataFinal(), dataFinal);
		assertEquals(contrato2.getDataFinal(), dataFinal);
	}

	@Test
	public void testGetServicos() {
		assertEquals(contrato1.getServicos(), servicos1);
		assertEquals(contrato2.getServicos(), servicos2);
	}

	@Test
	public void testAdicionaServico() {
		contrato1.adicionaServico(quarto2);
		contrato2.adicionaServico(quarto1);
		
		assertTrue(contrato1.getServicos().size() == 2);
		assertTrue(contrato2.getServicos().size() == 2);
	}

	@Test
	public void testCustoTotal() {
		assertTrue(contrato1.custoTotal() == 12000);
		assertTrue(contrato2.custoTotal() == 3600);
	}

}
