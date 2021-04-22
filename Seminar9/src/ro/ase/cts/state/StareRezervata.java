package ro.ase.cts.state;

public class StareRezervata implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof StareLibera) {
			masa.setStareMasa(this);
			System.out.println("Ati rezervat masa cu numarul " + masa.getNumarMasa());;
		} else {
			System.out.println("Masa nu este disponibila.");
		}
		
	}

}
