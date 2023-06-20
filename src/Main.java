public class Main {
    public static void main(String[] args) {

        //------------------Professores-----------------------//

        Professores professor1 = new Professores("Julia Souza", "000.000.000-00",
                10403491, "CEI Simeria", 2500, "Pós-graduada",
                "Matemática", 28, 2);

        Professores professor2 = new Professores("Joao Cruz", "000.000.000-11",
                10598763, "CEI Simeria", 2500, "Graduado",
                "Portugues", 30, 3);

        Professores professor3 = new Professores("Silvia Fernanda", "000.000.000-22",
                10598763, "Cardoso Fontes", 2900, "Graduada",
                "Sociologia", 60, 3);

        Professores professor4 = new Professores("Fabio Luiz", "000.000.000-33",
                10598763, "Pedro II", 2500, "Graduado",
                "Filosofia", 75, 3);

        Professores professor5 = new Professores("Elisabeth", "000.000.000-44",
                10598763, "Rui Barbosa", 2500, "Graduada",
                "Literatura", 90, 3);

        Professores professor6 = new Professores("Henrique Pereira", "000.000.000-55",
                10598763, "Rui Barbosa", 2500, "Graduada",
                "Física", 90, 3);


        //--------------------Coordenadores-----------------------------//

        Coodernadores coordenadorA = new Coodernadores("Ricardo", "000.000.000-66",
                12345678, "CEI Simeria", 3200, professor1);

        coordenadorA.adicionarProfessor(professor2);
        coordenadorA.adicionarProfessor(professor3);

        //------------------Adm---------------------//

        Administrativos assistente1 = new Administrativos("Karina", "000.000.000-77",
                56874138, "Cardoso Fontes", 2000, "Assistente",
                "Junior");

        //--------------Estagiários-----------------//

        Estagiarios estagiario1 = new Estagiarios("Hellen", "000.000.000-88",
                11223344, "Pedro II", 800, "Graduando",
                "Literatura", 90, 3);


        //---------------Dados----------------//

        System.out.println("------------------------");
        System.out.println("Funcionários sorteados: ");
        System.out.println();

        System.out.println("-----PROFESSORES-----");
        professor5.exibirDados();
        System.out.println();

        System.out.println("-----COORDENADORES-----");
        coordenadorA.exibirDados();
        System.out.println();

        System.out.println("-----ADMINISTRATIVOS-----");
        assistente1.exibirDados();
        System.out.println();

        System.out.println("-----ESTAGIÁRIOS-----");
        estagiario1.exibirDados();
        System.out.println();

    }
}