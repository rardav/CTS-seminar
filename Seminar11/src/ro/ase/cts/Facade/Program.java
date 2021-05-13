package ro.ase.cts.Facade;

public class Program {

	public static void main(String[] args) {
		Pacient p1 = new Pacient("Pacientescu", false);
		Pacient p2 = new Pacient("Gravescu", true);
		
		System.out.println(FacadeInternare.verificaPacient(p1));
		System.out.println(FacadeInternare.verificaPacient(p2));

	}

}
