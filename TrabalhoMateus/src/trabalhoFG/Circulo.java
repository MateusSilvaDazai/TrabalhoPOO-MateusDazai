package trabalhoFG;

public class Circulo extends FiguraGeometrica {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public Circulo() {
		// TODO Auto-generated constructor stub
	}

	
	//calculo da area
	public double calcArea(){
		double calcArea = Math.PI * (this.getRaio() * this.getRaio());
		return calcArea;
	}

	
	//calculo do perimetro
	public double calcPerimetro(){
		double calcPerimetro = 2 * Math.PI * this.getRaio();
		return calcPerimetro; 
	}

	//getter e setter
	public double getRaio(){
	return raio;
	}

	public void setRaio(double raio){
	this.raio = raio;
	}
}