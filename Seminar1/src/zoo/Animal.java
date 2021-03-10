package zoo;

public abstract class Animal {
	private String name;
	private float weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Animal(String name, float weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	
}
