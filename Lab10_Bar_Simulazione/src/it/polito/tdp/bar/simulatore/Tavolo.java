package it.polito.tdp.bar.simulatore;

public class Tavolo implements Comparable<Tavolo>{

	private int numPosti;
	private Integer idGruppo;
	private int disponibilitā;
	
	public Tavolo(int numPosti,int disponibilitā) {
		super();
		this.numPosti = numPosti;
		this.disponibilitā = disponibilitā;
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

	public int getDisponibilitā() {
		return disponibilitā;
	}

	public void setDisponibilitā(int disponibilitā) {
		this.disponibilitā = disponibilitā;
	}

	@Override
	public int compareTo(Tavolo o) {
		return this.numPosti-o.numPosti;
	}

	
	
	
	
}
