package ro.ase.cts.ChainOfResponsability;

public class ContIndisponibil extends Cont{

	public ContIndisponibil(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		System.out.println("Fonduri insuficiente pentru a extrage suma de: " + suma);
		
	}

}
