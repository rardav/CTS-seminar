package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

public class TesteGrupa {

	@Test
	public void constructorTest() {
		Grupa grupa = new Grupa(1050);
		Assert.assertEquals(1050, grupa.getNrGrupa());
	}
	
	@Test
	public void testareLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		Assert.assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testareLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		Assert.assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void inAfaraLimitelorTest() {
		Grupa grupa = new Grupa(1300);
	}

	@Test(timeout = 1000)
	public void performantaTest() {
		Grupa grupa = new Grupa(1050);
	}
	
	@Test
	public void testPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=0;i<10;i++) {
			Student student = new Student();
			student.adaugaNota(i+1);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.6f, grupa.getPromovabilitate(), .001f);
	}
	
	@Test
	public void limitaInferioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=0;i<10;i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.0f, grupa.getPromovabilitate(), .001f);
	}
	
	@Test
	public void limitaSuperioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for(int i=0;i<10;i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1f, grupa.getPromovabilitate(), .001f);
	}
	
	@Test
	public void boundaryTestPromovabilitate() {
		Grupa grupa = new Grupa(1010);
		assertEquals(0, grupa.getPromovabilitate(), 0.001f);
	}
	
	@Test 
	public void cardinalityPromovabilitateTest() {
		Grupa grupa = new Grupa(1050);
		Student student = new Student();
		student.adaugaNota(5);
		grupa.adaugaStudent(student);
		assertEquals(1f, grupa.getPromovabilitate(), 0.001f);
	}
	
	
}
