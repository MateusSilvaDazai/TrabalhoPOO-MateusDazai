package trabalhoFG;

public class Quadrado extends FiguraGeometrica {
	//calculo da area
	public double calcArea(){
		double area = getLado1() * getLado1();
		return area;
	}
	
	//calculo do perimetro
	public double calculaPerimetro(){
		double perimetro = getLado1()  * 4;
		return perimetro;
	}
}