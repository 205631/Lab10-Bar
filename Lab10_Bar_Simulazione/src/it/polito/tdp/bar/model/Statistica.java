package it.polito.tdp.bar.model;

public class Statistica {

	private int numTotClienti;
	private int numClientiSodd;
	private int numClientiInsodd;
	
	public Statistica(int numTotClienti, int numClientiSodd, int numClientiInsodd) {
		super();
		this.numTotClienti = numTotClienti;
		this.numClientiSodd = numClientiSodd;
		this.numClientiInsodd = numClientiInsodd;
	}

	public int getNumTotClienti() {
		return numTotClienti;
	}

	public void setNumTotClienti(int numTotClienti) {
		this.numTotClienti = numTotClienti;
	}

	public int getNumClientiSodd() {
		return numClientiSodd;
	}

	public void setNumClientiSodd(int numClientiSodd) {
		this.numClientiSodd = numClientiSodd;
	}

	public int getNumClientiInsodd() {
		return numClientiInsodd;
	}

	public void setNumClientiInsodd(int numClientiInsodd) {
		this.numClientiInsodd = numClientiInsodd;
	}

	@Override
	public String toString() {
		return "Totale clienti: "+numTotClienti+";\nClienti soddisfatti: "+numClientiSodd+";\nClienti insoddisfatti: "+numClientiInsodd+".";
	}
	
	
	
}
