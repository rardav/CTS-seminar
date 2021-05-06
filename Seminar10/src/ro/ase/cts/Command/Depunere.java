package ro.ase.cts.Command;

public class Depunere extends Command{

	public Depunere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	void executa() {
		super.getCont().depunere(super.getSuma());
		
	}

}
