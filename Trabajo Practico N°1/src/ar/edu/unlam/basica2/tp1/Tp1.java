package ar.edu.unlam.basica2.tp1;

public class Tp1 {
	private double radio;
	
	public Tp1(double radio){
		
		this.radio = radio;
	}
	
	public double getTp1 (){
		
		return this.radio;
	}
	
	public double CalcularPerimetro(){
		
		return 2 * Math.PI * this.radio;
	}
	
	
}
