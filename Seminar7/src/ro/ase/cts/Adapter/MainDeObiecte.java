package ro.ase.cts.Adapter;

public class MainDeObiecte {

	public static void oferaInfoCredit(Creditable credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}
	
	public static void main(String[] args) {
		Leasing leasing = new Leasing();
		AdapterCreditDeObiecte adapter = new AdapterCreditDeObiecte(leasing);
		oferaInfoCredit(adapter, "Dorin", 4000.25f);

	}

}
