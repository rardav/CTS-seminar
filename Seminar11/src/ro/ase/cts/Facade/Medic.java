package ro.ase.cts.Facade;

public class Medic {
	private String nume;
	private String specializare;
	
	public boolean esteNecesareInternare(Pacient pacient) {
		return pacient.isEsteInStareGrava();
	}

	public Medic(String nume, String specializare) {
		super();
		this.nume = nume;
		this.specializare = specializare;
	}
	
	
}
