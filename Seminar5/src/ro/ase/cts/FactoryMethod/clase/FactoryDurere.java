package ro.ase.cts.FactoryMethod.clase;

public class FactoryDurere implements Factory{

	@Override
	public Categorie creareCategorie(float pret) {
		// TODO Auto-generated method stub
		return new Durere(pret);
	}

}
