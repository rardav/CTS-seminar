package ro.ase.cts.builderV3;

public class Program {

	public static void main(String[] args) {
		
		Rezervare rezervare = Rezervare.builder().setCodRezervare(1).setBauturaRacoritoare(true).build();
		System.out.println(rezervare.toString());

	}

}
