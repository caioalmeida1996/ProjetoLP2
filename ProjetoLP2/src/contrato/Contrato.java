package contrato;

import java.util.ArrayList;
import java.util.Calendar;

import quartos.Quarto;
import servicos.Servico;
import servicos.ServicoSuplementar;

public class Contrato {

	private String nome, cpf, endereco;
	private Quarto quarto;
	private ArrayList<Servico> servicos = new ArrayList<Servico>();
	
	public Contrato(String nome, String cpf, String endereco, Quarto tipoQuarto) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.quarto = tipoQuarto;
		this.servicos.add(tipoQuarto);
	}
		
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public ArrayList<Servico> getServicos() {
		return servicos;
	}
	
	public String getTipoQuarto(){
		return quarto.getTipoDeQuarto();
	}
	
	public Calendar getDataInicioContrato(){
		return this.servicos.get(0).getDataSolicitacao();
	}
	
	public String getDataFimContrato(){
		//Quarto quarto = (Quarto) this.servicos.get(0);  
		return quarto.getDataFinal();
	}
	
	public boolean adicionaServico(ServicoSuplementar servico){
		return this.servicos.add(servico);
	}
	
	public boolean pesquisaServico(Servico servico){
		return this.servicos.contains(servico);
	}
	
	public void atualizaServico(Servico servico){
		this.servicos.set(this.servicos.indexOf(servico), servico);
	}
	
	public boolean removeServico(){
		return this.servicos.remove(servicos);
	}
	
	public double custoTotal(){
		double somador = 0;
		for (Servico servico : servicos) {
			somador += servico.custo();
		}
		return somador;
	}
	
}// fim da classe