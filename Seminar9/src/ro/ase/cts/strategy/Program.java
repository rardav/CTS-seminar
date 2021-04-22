package ro.ase.cts.strategy;

public class Program {

	public static void main(String[] args) {
		
		Client client = new Client("Popescu");
		
		client.setModPlata(new Cash());
		client.platesteNota(200.0);
		
		client.setModPlata(new Card(500.0));
		client.platesteNota(350);
		
		client.platesteNota(200);

	}

}
