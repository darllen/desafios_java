package geometria;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		
		
		r1.base = 3;
		r1.altura = 4;
		
		r2.base = 100;
		r2.altura = 250;
		
		r2.mudarBase(75);
		r1.dobrarAltura();
		r1.mudarBase(r2.altura);

		r1.imprimir();
		r2.imprimir();
	}

}
