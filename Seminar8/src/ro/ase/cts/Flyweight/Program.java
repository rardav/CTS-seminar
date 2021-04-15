package ro.ase.cts.Flyweight;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1 = new Rezervare(1,3,"12:00");
		Rezervare rezervare2 = new Rezervare(3,5,"16.00");
		
		FabricaRezervari fabrica = new FabricaRezervari();
		
		fabrica.getClient("oana@gmail.com").afisareInformatii(rezervare1);
		fabrica.getClient("oana@gmail.com").afisareInformatii(rezervare2);
		Rezervare rezervare3 = new Rezervare(2,4,"17:00");
		fabrica.getClient("email").afisareInformatii(rezervare3);
	}
}
