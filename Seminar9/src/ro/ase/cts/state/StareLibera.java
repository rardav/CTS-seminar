package ro.ase.cts.state;

public class StareLibera implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareLibera)) {
			System.out.println("Masa " + masa.getNumarMasa() + " a fost eliberata");
			masa.setStareMasa(this);
		} else {
			System.out.println("Masa este deja libera");
		}
		
	}

}
