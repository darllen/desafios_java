package heranca.atividade;

public class Retangulo extends FormaGeometrica {
    protected Integer comprimento;
    protected Integer altura;


    // contrutores
    public Retangulo() {
        super();
        this.altura = 5;
        this.comprimento = 5;
    }

    public Retangulo(Integer comprimento) {
        super();
        this.comprimento = comprimento;
        this.altura = comprimento;
    }

    public Retangulo(Integer comprimento, Integer altura) {
        super();
        this.comprimento = comprimento;
        this.altura = altura;
    }

    // métodos específicos
    @Override
    public Integer calcularArea(){
        return this.altura * this.comprimento;
    }

    @Override
    public Integer calcularPerimetro(){
        return 2 * (this.altura + this.comprimento);
    }

    public boolean ehQuadrado(){
        if (this.comprimento == this.altura){
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Retangulo a){
        if (this.comprimento == a.comprimento && this.altura == a.altura){
            return true;
        } else {
            return false;
        }
    }

    // getters and setters
    public Integer getComprimento() {
        return comprimento;
    }

    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }


}
