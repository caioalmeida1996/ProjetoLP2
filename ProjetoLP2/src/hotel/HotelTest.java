package hotel;

import static org.junit.Assert.*;
import hospede.Hospede;

import java.util.ArrayList;
import java.util.Calendar;

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
		contratos.add(contrato2);
		contratos.add(contrato3);
		contratos.add(contrato4);
		
	
		hotel1 = new Hotel(contratos);
	}

	///caso de uso 1
	@Test
	public void testPesquisaServico() {
		testAdicionaServico();
		System.out.println(hotel1.pesquisaServico("heitor", quarto1));
	}

	@Test
	public void testRemoveServico() {
		testAdicionaServico();
		System.out.println(hotel1.removeServico("heitor", quarto1));
		testGetServicos();
	}

	@Test
	public void testGetServicos() {
		testAdicionaServico();
		System.out.println(hotel1.getServicos("heitor"));
		System.out.println(hotel1.getServicos("Caio"));
		System.out.println(hotel1.getServicos("Gullo"));
		System.out.println(hotel1.getServicos("Akiles"));
	}

	@Test
	public void testAdicionaServico() {
		System.out.println(hotel1.adicionaServico("heitor", quarto1));
		System.out.println(hotel1.adicionaServico("Caio", quarto2));
		System.out.println(hotel1.adicionaServico("Gullo", quarto3));
		System.out.println(hotel1.adicionaServico("Akiles", quarto4));
	}

	///caso de uso 2
	@Test
	public void testPesquisaHospede() {
		System.out.println(hotel1.pesquisaHospede("heitor"));
		System.out.println(hotel1.pesquisaHospede("Caio"));
		System.out.println(hotel1.pesquisaHospede("Gullo"));
		System.out.println(hotel1.pesquisaHospede("Akiles"));
	}

	@Test
	public void testAtualizaHospede() {
		//System.out.println(hotel1.atualizaHospede(antigoHospede, novoHospede));
	}

	@Test
	public void testRemoveHospede() {
		hotel1.removeHospede(hospede1);
		System.out.println(hotel1.pesquisaHospede("heitor"));
		System.out.println(hotel1.pesquisaHospede("Caio"));
		System.out.println(hotel1.pesquisaHospede("Gullo"));
		System.out.println(hotel1.pesquisaHospede("Akiles"));
	}

	
	/// caso de uso 3
	@Test
	public void testGetContratos() {
		testAdicionaContrato();
		System.out.println(hotel1.getContratos());
		System.out.println(hotel1.getContratos());
	}

	@Test
	public void testAdicionaContrato() {
		System.out.println(hotel1.adicionaContrato(contrato1));
		System.out.println(hotel1.adicionaContrato(contrato2));
		System.out.println(hotel1.adicionaContrato(contrato3));
		System.out.println(hotel1.adicionaContrato(contrato4));
	}

	@Test
	public void testPesquisaContrato() {
		testAdicionaContrato();
		System.out.println("--");
		System.out.println(hotel1.pesquisaContrato(contrato1));
		System.out.println("--");
	}

	@Test
	public void testRemoveContrato() {
		System.out.println(hotel1.removeContrato(contrato1));
	}

}