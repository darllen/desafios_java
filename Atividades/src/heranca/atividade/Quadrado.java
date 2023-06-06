package heranca.atividade;

public class Quadrado extends Retangulo{


    // construtores
    public Quadrado() {
        super();
        this.setAltura(5);
        this.setComprimento(5);
    }

    public Quadrado(Integer valor) {
        super(valor);
        this.setAltura(valor);
        this.setComprimento(valor);
    }

    // métodos blablu
    public void aumentarQuadrado(){
        this.setAltura(getAltura() + 1);
        this.setComprimento(getComprimento() + 1);
    }
}
