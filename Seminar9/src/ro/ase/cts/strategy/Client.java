package ro.ase.cts.strategy;

public class Client {
	private ModPlata modPlata;
	private String nume;
	
	public ModPlata getModPlata() {
		return modPlata;
	}
	
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}

	public Client(String nume) {
		super();
		this.nume = nume;
	}
	
	public void platesteNota(double suma) {
		System.out.print(nume + " realizeaza plata. ");
		modPlata.plateste(suma);
	}
}
