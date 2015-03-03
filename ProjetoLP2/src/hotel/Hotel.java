package hotel;

import hospede.Hospede;

import java.util.ArrayList;

import servicos.Servico;

import contrato.Contrato;

public class Hotel {

	private ArrayList<Contrato> contratos = new ArrayList<Contrato>();

	public Hotel(ArrayList<Contrato> contratos) {
		super();
		this.contratos = contratos;
	}
	
	// ------- Caso de uso 1 --------
	
	/**
	 * Classe que pesquisa um hospede do hotel a partir do nome
	 * @param nome
	 * @return o objeto Hospede referente ao nome passado com parametro
	 */
	public String pesquisaHospede(String nome){
		for (Contrato contrato : contratos) {
			if (contrato.getHospede().getNome().equals(nome)){
				return "Hospede encontrado:" + contrato.getHospede();
			}
		}
		return "Hospede não encontrado.";
	}
	
	public String atualizaHospede(Hospede antigoHospede, Hospede novoHospede){
		for (int i = 0; i < contratos.size(); i++){
			if (contratos.get(i).getHospede().equals(antigoHospede)){
				contratos.get(i).setHospede(novoHospede);
				return "Hospede atualizado com sucesso.";
			}
		}
		return "Não foi possivel atualizar o hospede.";
	}
	
	public String removeHospede(Hospede hospede){
		for (int i = 0; i < contratos.size(); i++) {
			if (contratos.get(i).getHospede().equals(hospede)){
				contratos.remove(contratos.get(i));
				return "Hospede: " + hospede.getNome() + " foi removido com sucesso";
			}
		}
		return "Não foi possivel remover o Hospede.";
	}
	
	// ----------- Caso de Uso 2 -------------
	
	private int getIndiceHospede(String nomeHospede){
		for (int i = 0; i < contratos.size(); i++) {
			if (contratos.get(i).getHospede().getNome().equals(nomeHospede)){
				return i;
			}
		}
		return -1;
	}
	
	public String pesquisaServico(String nomeHospede, Servico servico){
		int indice = getIndiceHospede(nomeHospede);
		
		if (indice == -1)
			return "servico nao encontrado";
		
		contratos.get(indice).getServicos().contains(servico);
		return "servico encontrado: " + servico;
		
	}
	
	public boolean removeServico(String nomeHospede, Servico servico){
		int indice = getIndiceHospede(nomeHospede);
		
		if (indice == -1)
			return false;
		System.out.println(contratos.get(indice).getServicos().size());
		for (int i = 0; i < contratos.get(indice).getServicos().size(); i++){
			 
			if (contratos.get(indice).getServicos().get(i).equals(servico)){
				contratos.get(indice).getServicos().remove(contratos.get(indice).getServicos().get(i));
				return true;
			}
			
		}// fim do for
		
		return false;
	}
	
	public ArrayList<Servico> getServicos(String nomeHospede){
		int indice = getIndiceHospede(nomeHospede);
		
		if (indice == -1)
			return null;
		
		return contratos.get(indice).getServicos();
	}// fim do metodo
	
	public String adicionaServico(String nomeHospedeServico, Servico servico){
		int indice = getIndiceHospede(nomeHospedeServico);
		
		if (indice == -1)
			return "Nao foi possivel adicionar servico.";
		
		contratos.get(indice).getServicos().add(servico);
		return "Servico adicionado com sucesso.";
	}
	
	// ----------- Caso de uso 3 -------------
	
	public ArrayList<Contrato> getContratos() {
		return contratos;
	}

	public boolean adicionaContrato(Contrato contrato){
		return this.contratos.add(contrato);
	}
	
	public boolean pesquisaContrato(Contrato contrato){
		return this.contratos.contains(contrato);
	}
	
	public boolean removeContrato(Contrato contrato){
		return this.contratos.remove(contrato);
	}
	
}// fim da classe