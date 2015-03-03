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
import telas.TelaPrincipal;
import contrato.Contrato;

public class HotelTest2 {
	
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
		
		//contratos.add(null);
	
		
	
		hotel1 = new Hotel(contratos);
	}
	
	@Test
	public void usaHotel(){
		System.out.println(hotel1.adicionaContrato(contrato1));
		System.out.println(hotel1.adicionaContrato(contrato2));
		System.out.println(hotel1.adicionaContrato(contrato3));
		System.out.println(hotel1.adicionaContrato(contrato4));
		System.out.println(hotel1.getContratos());
		for (int i = 0; i < hotel1.getContratos().size(); i++) {
			System.out.println(hotel1.getContratos().get(i));
		}
		
		System.out.println(hotel1.pesquisaContrato(contrato3));
		System.out.println(hotel1.removeContrato(contrato2));
		System.out.println(hotel1.pesquisaContrato(contrato4));
		System.out.println(hotel1.getContratos());
		System.out.println(hotel1.adicionaContrato(contrato2));
		System.out.println("-------------------");
		System.out.println(hotel1.getServicos("heitor"));
		System.out.println(hotel1.getServicos("Caio"));
		System.out.println(hotel1.getServicos("Gullo"));
		System.out.println(hotel1.getServicos("Akiles"));
		System.out.println(hotel1.getServicos("Caio"));
		System.out.println(hotel1.pesquisaServico("Gullo", quarto3));
		System.out.println(hotel1.adicionaServico("Akiles", quarto3));
		System.out.println(hotel1.getServicos("Akiles"));
		System.out.println(hotel1.removeServico("Akiles", quarto3));
		System.out.println(hotel1.getServicos("Akiles"));
		System.out.println("--------------------");
		System.out.println(hotel1.pesquisaHospede("heitor"));
		System.out.println(hotel1.pesquisaHospede("Caio"));
		System.out.println(hotel1.pesquisaHospede("Gullo"));
		System.out.println(hotel1.pesquisaHospede("Akiles"));
		System.out.println(hotel1.removeHospede(hospede4));
		System.out.println(hotel1.pesquisaHospede("Akiles"));
		System.out.println(hotel1.atualizaHospede(hospede2, hospede3));
		System.out.println(hotel1.pesquisaHospede("Gullo"));
		
		
	}

}
