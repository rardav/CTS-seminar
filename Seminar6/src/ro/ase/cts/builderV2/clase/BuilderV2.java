package ro.ase.cts.builderV2.clase;

public class BuilderV2 implements IBuilder{

	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean muzicaAmbientala;
	private boolean bauturaRacoritoare;
	private String genMuzica;
	private int codRezervare;
	
	public BuilderV2() {
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.muzicaAmbientala = false;
		this.bauturaRacoritoare = false;
		this.genMuzica = "";
		this.codRezervare = 0;
	}
	
	public BuilderV2(int cod) {
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.muzicaAmbientala = false;
		this.bauturaRacoritoare = false;
		this.genMuzica = "";
		this.codRezervare = cod;
	}
	
	public BuilderV2 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}


	public BuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}


	public BuilderV2 setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}


	public BuilderV2 setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
		return this;
	}


	public BuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}


	public BuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}


	@Override
	public Rezervare build() {
		Rezervare rezervare = new Rezervare(mancareInclusa, scaunErgonomic, muzicaAmbientala,
				bauturaRacoritoare, genMuzica, codRezervare);
		return rezervare;
		
	}
	
}
