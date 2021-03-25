package ro.ase.cts.clase;

public class CategorieFactory {

	public Categorie creareCategorie(CategorieMedicamente categorieMedicamente) throws Exception {
		switch(categorieMedicamente) {
		case raceala:
			return new Raceala(20f);
		case body:
			return new Body(30f);
		case durere:
			return new Durere(40f);
		default:
			throw new Exception("Categorie inexistenta");
		}
	}
}
