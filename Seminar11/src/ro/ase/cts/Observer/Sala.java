package ro.ase.cts.Observer;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect{
	private List<Observer> observeri;
	private String numeSala;
	
	
	
	public Sala( String numeSala) {
		super();
		this.observeri = new ArrayList<Observer>();
		this.numeSala = numeSala;
	}
	@Override
	public void aboneazaClient(Observer observer) {
		observeri.add(observer);
		
	}
	@Override
	public void dezaboneazaClient(Observer observer) {
		observeri.remove(observer);
		
	}
	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer obs:observeri) {
			obs.receptionareMesaj(mesaj);
		}
	}
	
	public void anuntaMeciFotbal() {
		trimiteMesaj("MECI FOTBAL!!");
	}
	
	public void anuntaMeciTenis() {
		trimiteMesaj("MECI Tenis!!");
	}
}
