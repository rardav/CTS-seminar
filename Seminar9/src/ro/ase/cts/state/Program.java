package ro.ase.cts.state;

public class Program {

	public static void main(String[] args) {

		Masa masa = new Masa(1);
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		
		masa.OcupaMasa();
		
		masa.elibereazaMasa();

	}

}
