package ro.ase.cts.FactoryMethod.clase;

public class FactoryBody implements Factory{

	@Override
	public Categorie creareCategorie(float pret) {
		return new Body(pret);
	}

}
