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
	public Hospede pesquisaHospede(String nome){
		for (Contrato contrato : contratos) {
			if (contrato.getHospede().getNome().equals(nome)){
				return contrato.getHospede();
			}
		}
		return null;
	}
	
	public boolean atualizaHospede(Hospede antigoHospede, Hospede novoHospede){
		for (int i = 0; i < contratos.size(); i++){
			if (contratos.get(i).getHospede().equals(antigoHospede)){
				contratos.get(i).setHospede(novoHospede);
				return true;
			}
		}
		return false;
	}
	
	public boolean removeHospede(Hospede hospede){
		for (int i = 0; i < contratos.size(); i++) {
			if (contratos.get(i).getHospede().equals(hospede)){
				return contratos.remove(contratos.get(i));
			}
		}
		return false;
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
	
	public boolean pesquisaServico(String nomeHospede, Servico servico){
		int indice = getIndiceHospede(nomeHospede);
		
		if (indice == -1)
			return false;
		
		return contratos.get(indice).getServicos().contains(servico);
		
	}
	
	public boolean removeServico(String nomeHospede, Servico servico){
		int indice = getIndiceHospede(nomeHospede);
		
		if (indice == -1)
			return false;
		
		for (int i = 0; i < contratos.get(indice).getServicos().size(); i++){
			 
			if (servico.getClass().equals(contratos.get(indice).getServicos().get(i))){
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
	
	public boolean adicionaServico(String nomeHospedeServico, Servico servico){
		int indice = getIndiceHospede(nomeHospedeServico);
		
		if (indice == -1)
			return false;
		
		return contratos.get(indice).getServicos().add(servico);
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