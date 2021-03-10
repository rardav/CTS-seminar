package zoo;

public class Zebra extends Animal {
	private int stripesNo;

	public Zebra(String name, float weight, int stripesNo) {
		super(name, weight);
		this.stripesNo = stripesNo;
	}

	public int getStripesNo() {
		return stripesNo;
	}

	public void setStripesNo(int stripesNo) {
		this.stripesNo = stripesNo;
	}
	
	

}
