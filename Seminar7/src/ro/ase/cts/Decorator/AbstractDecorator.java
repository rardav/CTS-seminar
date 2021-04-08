package ro.ase.cts.Decorator;

public abstract class AbstractDecorator implements ICard{
	private ICard card;

	public AbstractDecorator(ICard card) {
		super();
		this.card = card;
	}

	@Override
	public void platesteOnline() {
		card.platesteOnline();
	}

	@Override
	public void platesteFizic() {
		card.platesteFizic();
	}
	
	public abstract void platesteContactless();

	public ICard getCard() {
		return card;
	}
	
	public String getDetinatorCard() {
		return card.getDetinatorCard();
	}
	
}
