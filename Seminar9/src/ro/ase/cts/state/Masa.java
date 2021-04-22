package ro.ase.cts.state;

public class Masa {
	private StareMasa stareMasa;
	private int numarMasa;
	
	public Masa(int numarMasa) {
		super();
		this.numarMasa = numarMasa;
		this.stareMasa= new StareLibera();
	}

	public StareMasa getStareMasa() {
		return stareMasa;
	}

	public void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}

	public int getNumarMasa() {
		return numarMasa;
	}

	public void setNumarMasa(int numarMasa) {
		this.numarMasa = numarMasa;
	}
	
	public void OcupaMasa() {
		modificaStareMasa(new StareOcupata());
	}
	
	public void rezervaMasa() {
		modificaStareMasa(new StareRezervata());
	}
	
	public void elibereazaMasa() {
		modificaStareMasa(new StareLibera());
	}
	
	public void modificaStareMasa(StareMasa stare) {
		stare.modificaStare(this);
	}

}
