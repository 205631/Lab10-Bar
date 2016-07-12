package it.polito.tdp.bar.simulatore;

public class Tavolo implements Comparable<Tavolo>{

	private int numPosti;
	private Integer idGruppo;
	private int disponibilità;
	
	public Tavolo(int numPosti,int disponibilità) {
		super();
		this.numPosti = numPosti;
		this.disponibilità = disponibilità;
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

	public int getDisponibilità() {
		return disponibilità;
	}

	public void setDisponibilità(int disponibilità) {
		this.disponibilità = disponibilità;
	}

	@Override
	public int compareTo(Tavolo o) {
		return this.numPosti-o.numPosti;
	}

	
	
	
	
}
