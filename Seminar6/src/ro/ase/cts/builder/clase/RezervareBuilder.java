package ro.ase.cts.builder.clase;

public class RezervareBuilder implements IBuilder{
	private Rezervare rezervare;
	
	public RezervareBuilder() {
		rezervare = new Rezervare(
				false, false, false, false, "gen", 1);
	}
	
	public RezervareBuilder(int codRezervare) {
		rezervare = new Rezervare(
				false, false, false, false, "gen", codRezervare);
	}
		
	public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
		rezervare.setMancareInclusa(mancareInclusa);
		return this;
		}

	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}

	public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
		rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}

	public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
		rezervare.setBauturaRacoritoare(bauturaRacoritoare);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}
}
