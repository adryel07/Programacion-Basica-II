package ar.edu.unlam.basica2.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tp1Test {

	@Test
	public void CalcularPerimetroDeRadio2() {
		Tp1 prueba = new Tp1 (2);
		assertEquals (2,prueba.getTp1(),0.01);
	}
	
	@Test
	public void CalcularPerimetroDeRadio3Punto7() {
		Tp1 prueba = new Tp1 (3.7);
		assertEquals (3.7,prueba.getTp1(),0.01);
	}
	
	@Test
	public void CalcularPerimetroDeRadio5() {
		Tp1 prueba = new Tp1 (5);
		assertEquals (5,prueba.getTp1(),0.01);
	}
	
	@Test
	public void CalcularPerimetroDeRadio10Punto9() {
		Tp1 prueba = new Tp1 (10.9);
		assertEquals (10.9,prueba.getTp1(),0.01);
	}
	
	@Test
	public void CompararResultadoCon615Punto73() {
		Tp1 prueba = new Tp1 (9.8);
		assertNotEquals (615.73,prueba.getTp1(),0.01);
	}
	
	@Test
	public void CompararResultadoCon865Punto67() {
		Tp1 prueba = new Tp1 (16.6);
		assertNotEquals (865.67,prueba.getTp1(),0.01);
	}
}
