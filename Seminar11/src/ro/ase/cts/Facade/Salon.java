package ro.ase.cts.Facade;

import java.util.ArrayList;
import java.util.List;

public class Salon {
	private List<Pat> paturi;
	
	public Salon(int nrPaturi) {
		initPaturi(nrPaturi);
	}

	private void initPaturi(int nrPaturi) {
		this.paturi = new ArrayList<Pat>();
		for(int i = 0; i< nrPaturi; i++) {
			paturi.add(new Pat(i+1, i%2==0));
		}
	}
	
	public boolean arePaturiLibere() {
		for(Pat pat: paturi) {
			if(pat.isLiber()) {
				return true;
			}
		}
		
		return false;
	}
}
