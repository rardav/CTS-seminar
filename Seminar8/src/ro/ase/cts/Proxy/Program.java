package ro.ase.cts.Proxy;

public class Program {

	public static void main(String[] args) {
		IRezervare rezervare = new Rezervare(3, 2);
		rezervare.anuntaRezervare();

		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rezervare);
		proxy.anuntaRezervare();
		
		((Rezervare)rezervare).setNrPersoane(4);
		proxy.anuntaRezervare();
	}

}
