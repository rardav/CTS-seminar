package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import junit.framework.Assert;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.teste.categorii.TesteNormale;
import ro.ase.cts.teste.categorii.TesteUrgente;
import ro.ase.cts.teste.claseTest.StudentFake;

public class GrupaFakeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category(TesteUrgente.class)
	@Test
	public void promovabilitateTest() {
		StudentFake studentFake = new StudentFake();
		studentFake.setAreRestanta(false);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		
		Assert.assertEquals(1,  grupa.getPromovabilitate(), 0.01);
	}
	
	@Category(TesteNormale.class)
	@Test
	public void promovabilitateCuRestanteTest() {
		StudentFake studentFake = new StudentFake();
		studentFake.setAreRestanta(true);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);
		
		Assert.assertEquals(0,  grupa.getPromovabilitate(), 0.01);
	}

}
