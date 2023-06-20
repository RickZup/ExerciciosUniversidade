public abstract class Funcionarios {

    private String nome;
    private String cpf;
    private int numeroDeRegistro;
    private String orgaoDeLocacao;
    double salario;

    public Funcionarios(String nome, String cpf, int numeroDeRegistro, String orgaoDeLocacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLocacao = orgaoDeLocacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public String getOrgaoDeLocacao() {
        return orgaoDeLocacao;
    }

    public double getSalario() {
        return salario;
    }

    public double aumentarSalario(){
        salario = (salario * 0.10) + salario;
        return salario;
    }

    public double reembolsoDespesas (double valor){
        salario += valor;
        return salario;
    }

    public void exibirDados (){
        System.out.println("Nome: " + getNome());
        System.out.println("Registro: " + getNumeroDeRegistro());
        System.out.println("Orgão de locação: " + getOrgaoDeLocacao());
    }

}
