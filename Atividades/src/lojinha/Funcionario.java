package lojinha;
// ctrl + shift + A, pesquisar plugins, Atom Material Icons
public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;



    public Funcionario() {
    }

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public int obterQuantidadeLetrasNome(String nome){
        return nome.length();
    }
    public String obterNomeAbreviado(String nomeCompleto){

        int indiceFirstName = nomeCompleto.indexOf(" ") + 1;
        int indiceLastName = nomeCompleto.lastIndexOf(" ") + 1;

        String nome = nomeCompleto.substring(0, indiceFirstName);
        String sobrenome = nomeCompleto.substring(indiceLastName);

        return  nome + sobrenome;
    }

    public String obterIniciais(String nomeCompleto){
        String[] lista = nomeCompleto.split(" ");
        String iniciais = "";

        for(String elemento : lista){
            String firstLetter = elemento.substring(0, 1);
            iniciais += firstLetter;
        }

        return iniciais;
    }

    public boolean verificarCPFFormatado(String numberCPF){
        boolean retorno;

        if (numberCPF.length() == 14){
            String mask = "..-";

            char characterAtIdx3 = numberCPF.charAt(3);
            char characterAtIdx7 = numberCPF.charAt(7);
            char characterAtIdx11 = numberCPF.charAt(11);

            String string1 = Character.toString(characterAtIdx3)
                    + Character.toString(characterAtIdx7)
                    + Character.toString(characterAtIdx11);

            if (string1.equals(mask)){ retorno = true; }
            else { retorno = false; }

        } else { retorno = false; }

        return retorno;
    }

    public String formatarCPF(String cpfFuncionario){
        String cpfFormatado = "";

        if (verificarCPFFormatado(this.cpf)){
            cpfFormatado = this.cpf;

        } else {
            // se a string só tem números e tem tamanho 11
            if(this.cpf.matches("[0-9]+") && this.cpf.length() == 11){

                cpfFormatado = cpfFuncionario.substring(0, 3) + "."
                        + cpfFuncionario.substring(3, 6) + "."
                        + cpfFuncionario.substring(6, 9) + "-"
                        + cpfFuncionario.substring(9, 11);

                this.cpf = cpfFormatado;

            } else { cpfFormatado = "CPF inválido!"; }
        }
        return cpfFormatado;
    }

    public int obterNumeroSalariosMinimos(double salario){
        double x = Math.ceil(salario / 1320); // salário arredondado para cima
        int qSalarios = (int ) x;

        return qSalarios; // arredonda para cima sempre
    }

    public void adicionarAumentoSalario(double percentual){
        double aumento = (percentual * this.salario) / 100;
        this.salario += aumento;
    }

    public static void main(String args[]){

        Funcionario fc = new Funcionario();
        fc.setCpf("07415402307");
        fc.setSalario(7450.78);
        String nomeTeste = "Catarina Ribeiro de Souza Lima";

        System.out.println(
                fc.obterQuantidadeLetrasNome(nomeTeste)
        );

        System.out.println(
                fc.obterNomeAbreviado(nomeTeste)
        );

        System.out.println(
                fc.obterIniciais(nomeTeste)
        );

        System.out.println(
                fc.verificarCPFFormatado("547.716.802-97")
        );

        System.out.println(
                fc.formatarCPF(fc.cpf)
        );

        System.out.println(
                fc.obterNumeroSalariosMinimos(fc.salario)
        );

        fc.adicionarAumentoSalario(10);
        System.out.println(
                String.format("%.2f", fc.getSalario())
        );



    }

}
