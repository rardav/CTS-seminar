package ro.ase.cts.Command;

public class Retragere extends Command{

	public Retragere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	void executa() {
		super.getCont().retragere(super.getSuma());
		
	}

}
