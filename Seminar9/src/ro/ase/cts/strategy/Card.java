package ro.ase.cts.strategy;

public class Card implements ModPlata {

	private double sold;
	
	public Card(double sold) {
		super();
		this.sold = sold;
	}

	@Override
	public void plateste(double sumaPlatita) {
		if(sold>=sumaPlatita) {
			System.out.println("Plateste cu cardul suma: "+sumaPlatita);
			sold -= sumaPlatita;
		} else {
			System.out.println("Fonduri insuficiente!");
		}
		
	}
	
}
