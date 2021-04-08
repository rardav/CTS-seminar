package ro.ase.cts.Adapter;

public class AdapterCreditDeClase extends Leasing implements Creditable {
	public AdapterCreditDeClase() {
		super();

	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		super.oferaLeasing(numeClient, suma);
	}

}
