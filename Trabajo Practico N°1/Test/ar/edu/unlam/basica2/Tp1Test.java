package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.basica2.Tp1;

public class Tp1Test {

	@Test
	public void CalcularPerimetroDeRadio2() {
		Tp1 Radio2 = new Tp1 (2);
		assertEquals (2,Radio2.getRadio(),0.01);
	}
	
	@Test
	public void CalcularPerimetroDeRadio3Punto7() {
		Tp1 Radio3Punto7 = new Tp1 (3.7);
		assertEquals (3.7,Radio3Punto7.getRadio(),0.01);
	}
	
	@Test
	public void CalcularPerimetroDeRadio5() {
		Tp1 Radio5 = new Tp1 (5);
		assertEquals (5,Radio5.getRadio(),0.01);
	}
	
	@Test
	public void CalcularPerimetroDeRadio10Punto9() {
		Tp1 Radio10Punto9 = new Tp1 (10.9);
		assertEquals (10.9,Radio10Punto9.getRadio(),0.01);
	}

	
	
	/*Modicacion de resultado calculando el area de un circulo con un radio de 9.8*/

	
	   @Test
	    public void ElAreaDeUnCirculoConRadio9Punto8Es301Punto71(){
		   Tp1 CirculoRadio9Punto8Es301Punto71 = new Tp1 (0);
		   CirculoRadio9Punto8Es301Punto71.setRadio(9.8);
		   assertEquals(301.71, CirculoRadio9Punto8Es301Punto71.calcularArea(), 0.01);
	   }
	
	@Test
	public void CompararResultadoCon615Punto73() {
		Tp1 ResultadoCon615Punto73 = new Tp1 (9.8);
		assertNotEquals (615.73,ResultadoCon615Punto73.getRadio(),0.01);
	}
	
	
	
	
	/*Modicacion de resultado calculando el area de un circulo con un radio de 16.6*/
	@Test
	 public void ElAreaDeUnCirculoConRadio16Punto6Es865Punto69(){
		Tp1 CirculoRadio16Punto6 = new Tp1(0);
		CirculoRadio16Punto6.setRadio(16.6);
		assertEquals(865.69, CirculoRadio16Punto6.calcularArea(), 0.01);
	}
	
	@Test
	public void CompararResultadoCon865Punto67() {
		Tp1 ResultadoCon865Punto67 = new Tp1 (16.6);
		assertNotEquals (865.67,ResultadoCon865Punto67.getRadio(),0.01);
	}
}
