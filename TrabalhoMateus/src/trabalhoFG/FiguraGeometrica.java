package trabalhoFG;

import java.util.Scanner;

public abstract class FiguraGeometrica {
	
	private double lado1;
	
	//calculo da area
	public double calcArea() {
		double area;
		area = lado1 * lado1;
		return area;
	}
	
	//calculo do perimetro
	public double calcPerimetro(){
		double perimetro = lado1 * 4;
		return perimetro;
	}
	
	//como ira exibir os dados
	public void exibirDados() {
		System.out.println("Exibindo Dados: ");
		System.out.println("Calculando da Area " + calcArea());
		System.out.println("Calculando Perimetro " + calcPerimetro());
	}
	
	
	//getter e setter
	public double getLado1() {
		return lado1;
	}
	
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	
	
	//main
	public static void main(String[] args) {
		//instanciando as classes
		
		Quadrado q = new Quadrado();
		Retangulo re = new Retangulo();
		Circulo c = new Circulo();
		
		//dando valores aos lados
		 q.setLado1(15); //quadrado
		 re.setLado1(10); //retangulo
		 re.setLado2(5); //retangulo
		 c.setRaio(4); //circulo
		
		 
		 //imprimindo os calculos
		 System.out.println("Forma Geometrica");
		 System.out.println("\n Quadrado");
		 q.exibirDados();
		 
		 System.out.println("\n Retangulo");
		 re.exibirDados();
		 
		 System.out.println("\n Circulo");
		 c.exibirDados();
		 
	}
}
