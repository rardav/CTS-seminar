package main;

import zoo.*;

public class Main {

	public static void main(String[] args) {
		Zookeeper keeper = new Zookeeper("Danut");
		Zoo zoo= new Zoo();
		zoo.setKeeper(keeper);
		
		Giraffe giraffe = new Giraffe("George", 101, 100);
		Giraffe giraffe2 = new Giraffe("Geani", 76, 200);
		
		zoo.addAnimal(giraffe2);
		zoo.addAnimal(giraffe);
		
		zoo.addAnimal(new Zebra("Zeze", 102, 25));
		zoo.addAnimal(new Zebra("Danut", 116, 76));
		
		zoo.feedAllAnimals();
	}
}
