package ro.ase.cts.Observer;

public class Program {

	public static void main(String[] args) {
		ClientAbonat num1 = new ClientAbonat("Numescu");
		ClientAbonat num2 = new ClientAbonat("Observescu");
		
		Sala sala = new Sala("Salisoara");
		
		sala.aboneazaClient(num1);
		sala.aboneazaClient(num2);
		sala.anuntaMeciFotbal();
		sala.dezaboneazaClient(num2);
		sala.anuntaMeciTenis();

	}

}
