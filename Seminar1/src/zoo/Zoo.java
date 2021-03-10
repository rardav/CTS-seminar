package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	public Zookeeper keeper;
	public List<Animal> animals;
	
	public void feedAllAnimals() {
		for(int i=0;i<animals.size();i++) {
			keeper.feed(animals.get(i));
		}
	}

	public Zookeeper getKeeper() {
		return keeper;
	}

	public void setKeeper(Zookeeper keeper) {
		this.keeper = keeper;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zoo(Zookeeper keeper, List<Animal> animals) {
		super();
		this.keeper = keeper;
		this.animals = animals;
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public Zoo() {
		keeper = new Zookeeper("Giani");
		animals = new ArrayList<>();
	}
}
