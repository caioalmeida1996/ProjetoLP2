package hotel;

import hospede.Hospede;

import java.util.ArrayList;

import contrato.Contrato;

public class Hotel {

	private ArrayList<Contrato> contratos = new ArrayList<Contrato>();
	private ArrayList<Hospede> hospedes = new ArrayList<Hospede>();

	public Hotel(ArrayList<Contrato> contratos) {
		super();
		this.contratos = contratos;
	}
	
	
//	public ArrayList<Hospede> getHospedes() {
//		for (int i = 0; i < contratos.size(); i++) {
//			hospedes.add(contratos.get(i).getHospede());			
//		}
//		return hospedes;
//	}
//
//	
//	public boolean pesquisaHospede(String nome){
//		getHospedes();
//		return this.contratos.contains(contrato);
//	}
//	
//	public boolean removeContrato(){
//		return this.contratos.remove(contratos);
//	}
	
	// -------------------caso 3 do projeto-------------------------------
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
