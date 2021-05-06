package ro.ase.cts.Command;

public class Constituire extends Command{

	public Constituire(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	void executa() {
		super.getCont().constituire(super.getSuma());	
	}
	
}
