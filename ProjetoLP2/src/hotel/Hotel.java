package hotel;

import hospede.Hospede;

import java.util.ArrayList;

import contrato.Contrato;

public class Hotel {

	private ArrayList<Contrato> contratos = new ArrayList<Contrato>();

	public Hotel(ArrayList<Contrato> contratos) {
		super();
		this.contratos = contratos;
	}
	
	// Caso de uso 1
	
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
	
	//
	
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