package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare = new RezervareBuilder().
				setCodRezervare(2).setBauturaRacoritoare(false).build();
		Rezervare rezervare2 = new RezervareBuilder().
				setCodRezervare(3).setMuzicaAmbientala(false).build();
		Rezervare rezervare3 = new RezervareBuilder(5).setBauturaRacoritoare(true).build();
		
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
	}

}
