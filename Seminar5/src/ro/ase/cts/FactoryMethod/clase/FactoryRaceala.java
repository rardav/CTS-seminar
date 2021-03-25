package ro.ase.cts.FactoryMethod.clase;

public class FactoryRaceala implements Factory{

	@Override
	public Categorie creareCategorie(float pret) {
		return new Raceala(pret);
	}
	
}
