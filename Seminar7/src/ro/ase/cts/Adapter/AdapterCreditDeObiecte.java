package ro.ase.cts.Adapter;

public class AdapterCreditDeObiecte implements Creditable{
	private Leasing leasing;

	public AdapterCreditDeObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		this.leasing.oferaLeasing(numeClient, suma);
	}
	
	
}
