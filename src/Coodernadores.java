import java.util.ArrayList;
import java.util.List;

public class Coodernadores extends Funcionarios{

    public List<Professores> supervisionados;

    public Coodernadores(String nome, String cpf, int numeroDeRegistro, String orgaoDeLocacao, double salario, Professores professor) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLocacao, salario);
        //this.supervisionados = supervisionados;
        supervisionados = new ArrayList<>();
        supervisionados.add(professor);
    }

    @Override
    public double aumentarSalario() {
        salario = (salario * 0.05) + salario;
        return salario;
    }

    public void adicionarProfessor (Professores adicionar){
        if (supervisionados.size() < 3){
            supervisionados.add(adicionar);
        } else {
            System.out.println("Número máximo de professores atingidos!");
            System.out.println(adicionar.getNome() + " não foi inserido a lista.");
            System.out.println("---------------------------------------");
        }
    }

    public void exibirListaDeProfessores (){
        System.out.println("Professores supervisionados por " + getNome() + ":");
        for (int i = 0; i < supervisionados.size(); i++){
            System.out.println(supervisionados.get(i).getNome());
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        exibirListaDeProfessores();
    }
}
