package ro.ase.cts.classes;

public class ClinicaVeterinara {
	private String nume;
	private String adresa;
	private int nrDoctori;
	private float buget;
	
	//Instanta statica declarata la momentul declararii
	private static final ClinicaVeterinara instanta = new ClinicaVeterinara("VetClinic", "Strada Dorobanti", 3, 325000.53f);
	
	//constructor private
	private ClinicaVeterinara(String nume, String adresa, int nrDoctori, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrDoctori = nrDoctori;
		this.buget = buget;
	}
	
	//functia statica publica care va returna instanta
	public static ClinicaVeterinara getInstance() {
		return instanta;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", nrDoctori=" + nrDoctori + ", buget="
				+ buget + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getNrDoctori() {
		return nrDoctori;
	}

	public void setNrDoctori(int nrDoctori) {
		this.nrDoctori = nrDoctori;
	}

	public float getBuget() {
		return buget;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}
	
	
	
	
	
	
	
}
