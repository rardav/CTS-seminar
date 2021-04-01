package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.Client;

public class Program {

	public static void main(String[] args) {
		
		Client client1 = new Client(100, "Numescu", 20);
		Client client2 = (Client) client1.copiaza();
		
		System.out.println(client1);
		System.out.println(client2);
		
		Bilet bil1 = new Bilet(0, "Ech1", "Ech2", "25/03/2021");
		
		Bilet bil2 = (Bilet) bil1.copiaza();
		bil2.setCod(2);
		
		Bilet bil3 = (Bilet) bil1.copiaza();
		bil3.setCod(3);
		
		System.out.println(bil2);
		System.out.println(bil3);
	}

}
