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
	
	@Test
	public void testCalculeazaMedie1Nota() {
		Student student = new Student();
		int nota = 8;
		
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedie3Note() {
		Student student = new Student();
		int nota1=8, nota2=9, nota3=10;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		float medie = (nota1 + nota2 + nota3)/3;
		assertEquals(medie, student.calculeazaMedie(), 0.01);
		}
	
	
	@Test
	public void testCalculeazaMedie0Note() {
		Student student = new Student();
		assertEquals(0, student.calculeazaMedie(), 0.01);
		}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGetNota() {
		Student student = new Student();
		int nota = 8;
		
		student.adaugaNota(nota);
		student.getNota(-1);
		}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		int nota1=8, nota2=3, nota3=10;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertTrue(student.areRestante());
		}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		int nota1=8, nota2=9, nota3=10;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		
		assertFalse(student.areRestante());
		}

}
