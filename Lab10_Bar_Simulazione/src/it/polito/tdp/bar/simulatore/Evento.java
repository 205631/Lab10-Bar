package it.polito.tdp.bar.simulatore;

import java.util.Random;

public class Evento implements Comparable<Evento>{

	public enum TipoEvento{
		ARRIVO_GRUPPO_CLIENTI,USCITA_GRUPPO_CLIENTI
	};
	private static int contatore=0;
	private int id;
	private TipoEvento tipo;
	private int tempoEvento;
	private static int tempoPrecedente;
	private int numPersone;
	private int durata;
	private float tolleranza;
	private int tavolo;
	
	public Evento(TipoEvento tipo) {
		super();
		this.id=contatore+1;
		contatore++;
		this.tipo=tipo;
		if(this.tipo.compareTo(Evento.TipoEvento.ARRIVO_GRUPPO_CLIENTI)==0){
			Random r=new Random();
			if(contatore==1){
				tempoEvento=r.nextInt();
			}else{
				tempoEvento=r.nextInt(11)+tempoPrecedente+1;
			}
			numPersone=r.nextInt(11)+1;
			durata=r.nextInt(61)+60;
			tolleranza=(float) (0.9*r.nextDouble());
		}
	}
	
	public Evento(TipoEvento tipo,int minutoUscita,int tavolo){
		this.tipo=tipo;
		this.tempoEvento=minutoUscita;
		this.tavolo=tavolo;
	}

	public TipoEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
	}

	public int getTempoEvento() {
		return tempoEvento;
	}

	public void setTempoEvento(int tempoEvento) {
		this.tempoEvento = tempoEvento;
	}

	public int getNumPersone() {
		return numPersone;
	}

	public void setNumPersone(int numPersone) {
		this.numPersone = numPersone;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public float getTolleranza() {
		return tolleranza;
	}

	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}

	public int getId() {
		return id;
	}

	public int getTavolo() {
		return tavolo;
	}

	public void setTavolo(int tavolo) {
		this.tavolo = tavolo;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Evento o) {
		return this.getTempoEvento()-o.getTempoEvento();
	}
	
	
}
