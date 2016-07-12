package it.polito.tdp.bar.simulatore;

public class Tavolo implements Comparable<Tavolo>{

	private int numPosti;
	private Integer idGruppo;
	private int disponibilit�;
	
	public Tavolo(int numPosti,int disponibilit�) {
		super();
		this.numPosti = numPosti;
		this.disponibilit� = disponibilit�;
		idGruppo=null;
	}

	public int getNumPosti() {
		return numPosti;
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}

	public Integer getIdGruppo() {
		return idGruppo;
	}

	public void setIdGruppo(Integer idGruppo) {
		this.idGruppo = idGruppo;
	}

	public int getDisponibilit�() {
		return disponibilit�;
	}

	public void setDisponibilit�(int disponibilit�) {
		this.disponibilit� = disponibilit�;
	}

	@Override
	public int compareTo(Tavolo o) {
		return this.numPosti-o.numPosti;
	}

	
	
	
	
}
