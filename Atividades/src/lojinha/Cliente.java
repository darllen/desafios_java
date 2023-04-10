package lojinha;

public class Cliente {
    private static int ULTIMO_CODIGO = 1;
    private int codigo;
    private String nome;
    public Cliente() {
        codigo = ULTIMO_CODIGO++;
    }
    public Cliente(String nome) {
        this();
        this.nome = nome;
    }
    public Cliente(Integer c, String n) {
        this.codigo = c;
        this.nome = n;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Poliana");
        Cliente c3 = new Cliente(45, "Poliana");
        Cliente c4 = new Cliente();
        c4.setNome("Carlos");
        c4.setCodigo(30);
        c4 = new Cliente("Nelson");
        System.out.println(c1.getCodigo());
        System.out.println(c2.getCodigo());
        System.out.println(c3.getCodigo());
        System.out.println(c4.getCodigo());
    }

}