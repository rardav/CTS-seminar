package ro.ase.cts.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.teste.categorii.TesteNormale;
import ro.ase.cts.teste.categorii.TesteUrgente;
import ro.ase.cts.teste.claseTest.StudentDummy;

class TestCaseDummy {

	private IStudent studentDummy;

	@BeforeEach
	void setUp() throws Exception {
		studentDummy = new StudentDummy();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdaugaStudent() {
		Grupa grupa = new Grupa(1010);
		grupa.adaugaStudent(studentDummy);
		
		assertEquals(1, grupa.getStudenti().size());
	}
	
	@Test
	public void testAdaugaStudentCardinality() {
		Grupa grupa = new Grupa(1000);
		IStudent studentDummy1 = new StudentDummy();
		IStudent studentDummy2 = new StudentDummy();
		grupa.adaugaStudent(studentDummy);
		grupa.adaugaStudent(studentDummy1);
		grupa.adaugaStudent(studentDummy2);
		assertEquals(3, grupa.getStudenti().size());
	}

}
