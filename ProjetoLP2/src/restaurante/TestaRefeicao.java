package restaurante;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class TestaRefeicao {

	@Test
	public void testaCustos() {
		Refeicao refeicao = new Refeicao(30);
		assertTrue(30 == refeicao.custo());
		
		Refeicao refeicao2 = new Refeicao(40);
		assertTrue(40 == refeicao2.custo());
		
		Refeicao refeicao3 = new Refeicao(50);
		assertTrue(50 == refeicao3.custo());
	}

	@Test
	public void testaDatas(){
		Refeicao refeicao = new Refeicao(30);
		
		Calendar dataAtual = Calendar.getInstance();
		refeicao.setDataSolicitacao(dataAtual);
		assertTrue(refeicao.getDataSolicitacao().getTime().equals(dataAtual.getTime()));
	}
	
}