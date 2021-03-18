package ro.ase.cts.DRclasses;

import ro.ase.cts.classes.ClinicaVeterinaraLazy;

public class Doctor {
	private String nume;
	private int vechime;
	private boolean ePensionat;
	
	private static Doctor instanta = null;

	private Doctor(String nume, int vechime, boolean ePensionat) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.ePensionat = ePensionat;
	}
	
	public static synchronized Doctor getInstance(String nume, int vechime, boolean ePensionat) {
		if(instanta==null) {
			instanta = new Doctor(nume, vechime, ePensionat);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "Doctor [nume=" + nume + ", vechime=" + vechime + ", ePensionat=" + ePensionat + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
}
