package it.polito.tdp.bar.model;

import it.polito.tdp.bar.simulatore.Simulatore;

public class Model {
	
	private Simulatore sim;
	
	public Statistica simula(){
		sim=new Simulatore();
		sim.inizializza();
		sim.simula();
		Statistica s=new Statistica(sim.getInsoddisfatti()+sim.getSoddisfatti(),sim.getSoddisfatti(),sim.getInsoddisfatti());
		return s;
	}
	
}
