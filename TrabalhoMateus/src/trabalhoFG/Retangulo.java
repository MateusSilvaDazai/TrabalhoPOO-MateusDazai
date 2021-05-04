package trabalhoFG;

public class Retangulo extends FiguraGeometrica {
	private double lado2;
	
	//getter e setter
	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	//calculo da area
	public double calcArea() {
		double calcArea = getLado1() * lado2;
		return calcArea;
	}
	
	//calculo do perimetro
	public double calcPerimetro() {
		double calcPerimetro = (2*getLado1()) + (2*lado2);
		return calcPerimetro;
	}
	
	//como ira exibir os dados
	public void exibirDados() {
		System.out.println("Exibindo Dados: ");
		System.out.println("Calculando da Area " + calcArea());
		System.out.println("Calculando Perimetro " + calcPerimetro());
	}
}