package zoo;

public class Zookeeper {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void feed(Animal animal) {
		System.out.println("Feeding "+animal.getName()+".");
	}

	public Zookeeper(String name) {
		super();
		this.name = name;
	}
}
