package ro.ase.cts.builderV2.clase;

public class Rezervare {
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean muzicaAmbientala;
	private boolean bauturaRacoritoare;
	private String genMuzica;
	private int codRezervare;
	
	public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean muzicaAmbientala,
			boolean bauturaRacoritoare, String genMuzica, int codRezervare) {
		super();
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.muzicaAmbientala = muzicaAmbientala;
		this.bauturaRacoritoare = bauturaRacoritoare;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}
	public boolean isMancareInclusa() {
		return mancareInclusa;
	}
	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}
	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}
	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}
	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}
	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}
	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}
	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	@Override
	public String toString() {
		return "Rezervare [mancareInclusa=" + mancareInclusa + ", scaunErgonomic=" + scaunErgonomic
				+ ", muzicaAmbientala=" + muzicaAmbientala + ", bauturaRacoritoare=" + bauturaRacoritoare
				+ ", genMuzica=" + genMuzica + ", codRezervare=" + codRezervare + "]";
	}
	
	
}
