import java.util.ArrayList;
import java.util.List;

public class Professores extends Funcionarios {

    String nivelDeGraduacao;
    String disciplina;
    int quantidadeDeAlunos;
    int quantidadeDeTurmas;
    public Turma turma; //ToDo Pesquisar mais sobre composição, não entendi direito.

    public Professores(String nome, String cpf, int numeroDeRegistro, String orgaoDeLocacao, double salario, String nivelDeGraduacao, String disciplina, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLocacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplina = disciplina;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    public int adicionaTurma(Integer adicionar){
        quantidadeDeTurmas += adicionar;
        return quantidadeDeTurmas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Nível de graduação: " + getNivelDeGraduacao());
        System.out.println("Disciplina lecionada: " + getDisciplina());
    }
}
