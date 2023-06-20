public class Administrativos extends Funcionarios{

    String funcaoAdm;
    String senioridade;

    public Administrativos(String nome, String cpf, int numeroDeRegistro, String orgaoDeLocacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, String.valueOf(cpf), numeroDeRegistro, orgaoDeLocacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + getFuncaoAdm());
        System.out.println("Senioridade: " + getSenioridade());
    }
}
