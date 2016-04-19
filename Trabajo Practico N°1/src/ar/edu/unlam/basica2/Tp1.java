package ar.edu.unlam.basica2;

public class Tp1 {
	
	private static final double PI = 3.1415926535897932384626433832795;
	private double radio;
	
	public Tp1(double radio){
		
		this.radio = radio;
	}
	
	public double getRadio (){
		
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularPerimetro(){
		
        double perimetro=0.00;
		
		perimetro = 2 * PI * getRadio();
		
		return perimetro;	
	}	
	
	public double calcularArea(){
		
		double area = 0.00;
		
		area = PI*(getRadio()*getRadio());
		
		return area;		
	}
	
}
