package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTestSetup {
	Grupa grupa;
	
	@Before
	public void test() {
		grupa = new Grupa(1005);
		for(int i=0;i<36;i++) {
			Student student = new Student();
			student.adaugaNota(i%11 + 1);
			grupa.adaugaStudent(student);
		}
		grupa.getPromovabilitate();
	}
	
	@Test(timeout = 100)
	public void performancePromovabilitate() {
		grupa.getPromovabilitate();
	}

}
