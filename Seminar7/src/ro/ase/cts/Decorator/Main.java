package ro.ase.cts.Decorator;

public class Main {

	public static void main(String[] args) {
		ICard card = new Card("Nelu");
		card.platesteFizic();
		card.platesteOnline();
		
		AbstractDecorator decorator = new Decorator(card);
		decorator.platesteContactless();

	}

}
