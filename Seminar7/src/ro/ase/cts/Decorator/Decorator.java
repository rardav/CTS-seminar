package ro.ase.cts.Decorator;

public class Decorator extends AbstractDecorator{

	public Decorator(ICard card) {
		super(card);
	}

	@Override
	public void platesteContactless() {
		System.out.println(super.getCard().getDetinatorCard() + " plateste contactless.");
		
	}
}
