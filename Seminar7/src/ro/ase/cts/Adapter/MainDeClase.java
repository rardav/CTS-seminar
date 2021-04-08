package ro.ase.cts.Adapter;

public class MainDeClase {

	public static void oferaInfoCredit(Creditable credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}
	
	public static void main(String[] args) {
		AdapterCreditDeClase adapter = new AdapterCreditDeClase();
		oferaInfoCredit(adapter, "Dorescu", 342.23f);

	}

}
