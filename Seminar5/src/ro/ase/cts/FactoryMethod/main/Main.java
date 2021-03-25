package ro.ase.cts.FactoryMethod.main;

import ro.ase.cts.FactoryMethod.clase.Categorie;
import ro.ase.cts.FactoryMethod.clase.Factory;
import ro.ase.cts.FactoryMethod.clase.FactoryDurere;
import ro.ase.cts.FactoryMethod.clase.FactoryGripa;

public class Main {
	
	public static Factory getTipFactory() {
		return new FactoryGripa();
	}

	public static void printeazaCategorie(Factory factory, float pret) {
		Categorie categorie = factory.creareCategorie(pret);
		System.out.println(categorie.toString());
	}
	
	public static void main(String[] args) {
		printeazaCategorie(getTipFactory(), 20f);
	}

}
