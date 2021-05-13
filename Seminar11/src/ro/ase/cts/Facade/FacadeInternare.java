package ro.ase.cts.Facade;

public class FacadeInternare {	
	public static String verificaPacient(Pacient pacient) {
		Medic medic = new Medic("Numescu", "Chirurg");
		StringBuilder stringBuilder = new StringBuilder();
		if(pacient.isEsteInStareGrava()) {
			stringBuilder.append("Pacientul " + pacient.getNume() + " este in stare grava, trimite catre medic. ");
		} else {
			stringBuilder.append("Pacientul nu necesita internare. ");
		}
		if(medic.esteNecesareInternare(pacient)) {
			stringBuilder.append("Medicul a decis ca este necesara internarea. ");
			
			Salon salon = new Salon(10);
			if(salon.arePaturiLibere()) {
				stringBuilder.append(pacient.getNume() + " poate fi internat in salonul nostru.");
			} else {
				stringBuilder.append(pacient.getNume() + " nu are locuri disponibile, va fi trimis catre alt spital. ");
			}
		}
		
		return stringBuilder.toString();
	}
}
