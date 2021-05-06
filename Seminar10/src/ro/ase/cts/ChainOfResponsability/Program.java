package ro.ase.cts.ChainOfResponsability;

public class Program {

	public static void main(String[] args) {
		
		Cont curent = new ContCurent(1500, "Numescu", null);
		Cont economii = new ContEconomii(2500, "Numescu", null);
		Cont credit = new ContCredit(3000, "Numescu", null);
		Cont indisponibil = new ContIndisponibil(0, "Numescu", null);
		
		curent.setSuccesor(economii);
		economii.setSuccesor(credit);
		credit.setSuccesor(indisponibil);
		
		curent.plateste(8000);
	}

}
