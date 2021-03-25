package ro.ase.cts.FactoryMethod.clase;

public abstract class Categorie {
	 float pretDeBaza;

	protected Categorie(float pretDeBaza) {
		super();
		this.pretDeBaza = pretDeBaza;
	}

	public float getPretDeBaza() {
		return pretDeBaza;
	}
	 
	 
}
