package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testConstructorRightName() {
		String nume = "Numescu";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testAddToList() {
		Student student = new Student();
		int nota = 8;
		
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAddToListCount() {
		Student student = new Student();
		int nota = 8;
		
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	

}
