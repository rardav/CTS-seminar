package ro.ase.cts.Command;

public class Program {

	public static void main(String[] args) {
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituire(new ContBancar("Numescu"), 500));
		manager.invoca(new Retragere(new ContBancar("Numescian"), 200));
		manager.invoca(new Depunere(new ContBancar("Numelu"), 100));
		manager.executaComanda();
		manager.executaComanda();
		manager.executaComanda();
	}

}
