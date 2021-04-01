package ro.ase.cts.builderV3;

import ro.ase.cts.builderV2.clase.BuilderV2;

public class Rezervare {
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean muzicaAmbientala;
	private boolean bauturaRacoritoare;
	private String genMuzica;
	private int codRezervare;
	

	public Rezervare(RezervareBuilder rezervareBuilder) {
		this.mancareInclusa = rezervareBuilder.mancareInclusa;
		this.scaunErgonomic = rezervareBuilder.scaunErgonomic;
		this.muzicaAmbientala = rezervareBuilder.muzicaAmbientala;
		this.bauturaRacoritoare = rezervareBuilder.bauturaRacoritoare;
		this.genMuzica = rezervareBuilder.genMuzica;
		this.codRezervare = rezervareBuilder.codRezervare;
	}
	
	public boolean isMancareInclusa() {
		return mancareInclusa;
	}

	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}

	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}

	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}

	public String getGenMuzica() {
		return genMuzica;
	}

	public int getCodRezervare() {
		return codRezervare;
	}

	@Override
	public String toString() {
		return "Rezervare [mancareInclusa=" + mancareInclusa + ", scaunErgonomic=" + scaunErgonomic
				+ ", muzicaAmbientala=" + muzicaAmbientala + ", bauturaRacoritoare=" + bauturaRacoritoare
				+ ", genMuzica=" + genMuzica + ", codRezervare=" + codRezervare + "]";
	}
	
	public static RezervareBuilder builder() {
		return new RezervareBuilder();
	}
	
	//===================================================================================================== INNER
	public static class RezervareBuilder implements IBuilder{
		
		private boolean mancareInclusa;
		private boolean scaunErgonomic;
		private boolean muzicaAmbientala;
		private boolean bauturaRacoritoare;
		private String genMuzica;
		private int codRezervare;
		
		public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
			this.mancareInclusa = mancareInclusa;
			return this;
		}

		public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
			this.scaunErgonomic = scaunErgonomic;
			return this;
		}

		public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
			this.muzicaAmbientala = muzicaAmbientala;
			return this;
		}

		public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
			this.bauturaRacoritoare = bauturaRacoritoare;
			return this;
		}

		public RezervareBuilder setGenMuzica(String genMuzica) {
			this.genMuzica = genMuzica;
			return this;
		}
		
		public RezervareBuilder setCodRezervare(int codRezervare) {
			this.codRezervare = codRezervare;
			return this;
		}
		
		@Override
		public Rezervare build() {
			return new Rezervare(this);
		}
		
	}
	
}
