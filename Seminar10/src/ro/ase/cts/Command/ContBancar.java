package ro.ase.cts.Command;

public class ContBancar {
	private String detinator;
	private float suma;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	public void constituire(float suma) {
		System.out.println("Contul a fost constituit!");
		this.suma = suma;
	}
	
	public void retragere(float suma) {
		if(this.suma >= suma) {
			this.suma -= suma;
			System.out.println("O retragere a fost efectuata");
		} else {
			System.out.println("Fonduri insuficiente!");
		}
	}
	
	public void depunere(float suma) {
		this.suma += suma;
		System.out.println("Suma a fost depusa!");
	}
	
	
	
	
}
