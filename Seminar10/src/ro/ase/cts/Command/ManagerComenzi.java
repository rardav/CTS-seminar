package ro.ase.cts.Command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	public List<Command> comenzi;
	
	public ManagerComenzi() {
		this.comenzi = new ArrayList<>();
	}
	
	public void invoca(Command comanda) {
		this.comenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(this.comenzi.size()>0) {
			comenzi.get(0).executa(); //suma trebuia sa fie atribut in clasa
			comenzi.remove(0);
		}
	}
}
