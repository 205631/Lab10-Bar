package it.polito.tdp.bar.simulatore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Simulatore {

	private List<Tavolo> tavoli;
	
	private Queue<Evento> listaEventi;
	
	private int soddisfatti=0;
	private int insoddisfatti=0;
	
	public void inizializza(){
		
		tavoli=new ArrayList<Tavolo>();
		listaEventi=new PriorityQueue<>();
		
		tavoli.add(new Tavolo(10,2));
		tavoli.add(new Tavolo(8,4));
		tavoli.add(new Tavolo(6,4));
		tavoli.add(new Tavolo(4,5));
		
		Collections.sort(tavoli);
		
		for(int i=1;i<=2000;i++){
			listaEventi.add(new Evento(Evento.TipoEvento.ARRIVO_GRUPPO_CLIENTI));
		}
	}
	
	public void passo(){
		boolean flag=false;
		Evento e=listaEventi.poll();
		switch(e.getTipo()){
		
		case ARRIVO_GRUPPO_CLIENTI:
			int n=e.getNumPersone();
			for(Tavolo t:tavoli){
				if(t.getNumPosti()==n && t.getDisponibilità()!=0){
					t.setDisponibilità(t.getDisponibilità()-1);
					listaEventi.add(new Evento(Evento.TipoEvento.USCITA_GRUPPO_CLIENTI,e.getTempoEvento()+e.getDurata(),n));
					flag=true;
					soddisfatti+=n;
					break;
				}else{
					if(t.getNumPosti()>=n && t.getNumPosti()<=2*n && t.getDisponibilità()!=0){
						t.setDisponibilità(t.getDisponibilità()-1);
						listaEventi.add(new Evento(Evento.TipoEvento.USCITA_GRUPPO_CLIENTI,e.getTempoEvento()+e.getDurata(),t.getNumPosti()));
						flag=true;
						soddisfatti+=n;
						break;
					}
				}
			}
			if(flag==false){
				Random r=new Random();
				if(e.getTolleranza()>=r.nextFloat()){
					soddisfatti+=n;
				}else{
					insoddisfatti+=n;
				}
			}
			break;
		case USCITA_GRUPPO_CLIENTI:
			for(Tavolo t:tavoli){
				if(t.getNumPosti()==e.getTavolo()){
					t.setDisponibilità(t.getDisponibilità()+1);
				}
			}
			break;
		default:
			System.err.println("ERRORE!!!!");
			break;
		
		}
	}
	
	public void simula(){
		while(!listaEventi.isEmpty()){
			this.passo();
		}
	}

	public int getSoddisfatti() {
		return soddisfatti;
	}

	public int getInsoddisfatti() {
		return insoddisfatti;
	}
	
}
