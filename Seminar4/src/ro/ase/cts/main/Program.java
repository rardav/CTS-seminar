package ro.ase.cts.main;

import ro.ase.cts.DRclasses.Doctor;
import ro.ase.cts.classes.ClinicaVeterinara;
import ro.ase.cts.classes.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {
		//ClinicaVeterinara cl1 = ClinicaVeterinara.getInstance();
		//ClinicaVeterinara cl2 = ClinicaVeterinara.getInstance();

		
//		System.out.println(cl1);
		//System.out.println(cl2);
		
		ClinicaVeterinaraLazy cl1 = ClinicaVeterinaraLazy.getInstance("ClinVet", "Str. Independetei", 4, 4500.45f);
		ClinicaVeterinaraLazy cl2 = ClinicaVeterinaraLazy.getInstance("VetClin", "Str. Libertatii", 5, 2500.45f);
		
		cl1.setNume("Clin1");
		cl2.setNrDoctori(10);
		
		System.out.println(cl1);
		System.out.println(cl2);
		System.out.println("\n===================\n");
		
		//clasa personalizata
		
		Doctor doc1 = Doctor.getInstance("Numescu", 25, false);
		Doctor doc2 = Doctor.getInstance("Nenumescu", 46, true);
	
		System.out.println(doc1);
		System.out.println(doc2);
		
		doc2.setNume("Numescunu");
		System.out.println(doc1);
	}

}
