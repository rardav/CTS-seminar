package ro.ase.cts.Composite;

public class Program {

	public static void main(String[] args) {

		IOptiuniMeniu meniu = new Sectiune("Meniu");
		
		IOptiuniMeniu opt1 = new Sectiune("bauturi");
		IOptiuniMeniu opt2 = new Sectiune("desert");
		
		IOptiuniMeniu item1 = new Item("frappe");
		IOptiuniMeniu item2 = new Item("apa plata");
		IOptiuniMeniu item3 = new Item("papanasi");
		
		try {
			opt1.adaugaNod(item1);
			opt1.adaugaNod(item2);
			opt2.adaugaNod(item3);
			
			meniu.adaugaNod(opt1);
			meniu.adaugaNod(opt2);
			
			//meniu.descriere();
			
			opt1.stergeNod(item1);
			opt2.adaugaNod(item1);
			
			meniu.descriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
