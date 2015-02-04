package hotel;

import java.util.ArrayList;

import contrato.Contrato;

public class Hotel {

	private ArrayList<Contrato> contratos = new ArrayList<Contrato>();

	public Hotel(ArrayList<Contrato> contratos) {
		super();
		this.contratos = contratos;
	}
	
	public ArrayList<Contrato> getContratos() {
		return contratos;
	}

	public boolean adicionaContrato(Contrato contrato){
		return this.contratos.add(contrato);
	}
	
	public boolean pesquisaContrato(Contrato contrato){
		return this.contratos.contains(contrato);
	}
	
	public boolean removeContrato(){
		return this.contratos.remove(contratos);
	}
	
}// fim da classe
