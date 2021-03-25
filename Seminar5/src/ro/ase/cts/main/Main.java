package ro.ase.cts.main;

import ro.ase.cts.clase.Categorie;
import ro.ase.cts.clase.CategorieFactory;
import ro.ase.cts.clase.CategorieMedicamente;
import ro.ase.cts.clase.Durere;

public class Main {
	
	public static CategorieMedicamente getTipCategorie() {
		return CategorieMedicamente.raceala;
	}

	public static void main(String[] args) {
		CategorieFactory factory = new CategorieFactory();
		
		try {
			Categorie body = factory.creareCategorie(CategorieMedicamente.body);
			Categorie durere = factory.creareCategorie(CategorieMedicamente.durere);
			Categorie categorieX = factory.creareCategorie(getTipCategorie());
			
			System.out.println(body.toString());
			System.out.println(durere.toString());
			System.out.println(categorieX.toString());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
