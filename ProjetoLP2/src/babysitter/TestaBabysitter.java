package babysitter;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class TestaBabysitter {

	@Test
	public void testaBabysitterNormal() {
		
		// Criando um objeto Calendar e posteriormente configurando sua data e hora
		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.YEAR, 2014);
		data1.set(Calendar.MONTH, 5);
		data1.set(Calendar.DAY_OF_MONTH, 13);
		data1.set(Calendar.HOUR_OF_DAY, 7);
		
		// Criando um outro objeto Calendar e posteriormente configurando sua data e hora
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.YEAR, 2014);
		data2.set(Calendar.MONTH, 5);
		data2.set(Calendar.DAY_OF_MONTH, 13);
		data2.set(Calendar.HOUR_OF_DAY, 18);
		
		Babysitter b1 = new Babysitter();
		b1.setDataSolicitacao(data1);
		b1.setDataFinalizacao(data2);
		
		// Testando o custo do servico de babysitter normal durante todo o horario disponivel (7h às 18h).
		assertTrue(275 == b1.custo());
		
		// Testando o custo do servico de babysitter durante uma hora.
		data2.set(Calendar.HOUR_OF_DAY, 8);
		b1.setDataFinalizacao(data2);
		assertTrue(25 == b1.custo());
		
	}// fim de testaBabysitterNormal()

	@Test
	public void testaBabysitterDobrado() {
		
		// Criando um objeto Calendar e posteriormente configurando sua data e hora
		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.YEAR, 2014);
		data1.set(Calendar.MONTH, 5);
		data1.set(Calendar.DAY_OF_MONTH, 13);
		data1.set(Calendar.HOUR_OF_DAY, 18);
		
		// Criando um outro objeto Calendar e posteriormente configurando sua data e hora
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.YEAR, 2014);
		data2.set(Calendar.MONTH, 5);
		data2.set(Calendar.DAY_OF_MONTH, 14);
		data2.set(Calendar.HOUR_OF_DAY, 7);
		
		Babysitter b1 = new Babysitter();
		b1.setDataSolicitacao(data1);
		b1.setDataFinalizacao(data2);
		
		// Testando o custo do servico de babysitter dobrado durante todo o horario disponivel (18h às 7h).
		assertTrue(650 == b1.custo());
		
		// Testando o custo do servico de babysitter durante uma hora.
		data2.set(Calendar.DAY_OF_MONTH, 13);
		data2.set(Calendar.HOUR_OF_DAY, 19);
		b1.setDataFinalizacao(data2);
		assertTrue(50 == b1.custo());
		
	}// fim de testaBabysitterNormal()
	
	@Test
	public void testaBabysitterSimplesDobrado() {
		
		// Criando um objeto Calendar e posteriormente configurando sua data e hora
		Calendar data1 = Calendar.getInstance();
		data1.set(Calendar.YEAR, 2014);
		data1.set(Calendar.MONTH, 5);
		data1.set(Calendar.DAY_OF_MONTH, 13);
		data1.set(Calendar.HOUR_OF_DAY, 12);
		
		// Criando um outro objeto Calendar e posteriormente configurando sua data e hora
		Calendar data2 = Calendar.getInstance();
		data2.set(Calendar.YEAR, 2014);
		data2.set(Calendar.MONTH, 5);
		data2.set(Calendar.DAY_OF_MONTH, 14);
		data2.set(Calendar.HOUR_OF_DAY, 12);
		
		Babysitter b1 = new Babysitter();
		b1.setDataSolicitacao(data1);
		b1.setDataFinalizacao(data2);
		
		// Testando o custo do servico de babysitter durante 24 horas, 11 horas simples mais 13 dobradas.
		assertTrue(925 == b1.custo());
		
	}// fim de testaBabysitterNormal()
	
}// fim da classe
