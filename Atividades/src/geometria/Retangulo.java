package geometria;

public class Retangulo {
	public double altura;
	public double base;
	
	
	public Retangulo() {

	};


	public Retangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	};


	public Retangulo(double base) {
		this.base = base;
	};
	
	
	
	public void imprimir() {
		System.out.println("A área do retângulo é: " + this.base * this.altura);
	}
	
	
	public void dobrarAltura() {
		this.altura *= 2;
	}
	
	public void mudarBase(double newBase) {
		this.base = newBase;
		
	}
	
}
