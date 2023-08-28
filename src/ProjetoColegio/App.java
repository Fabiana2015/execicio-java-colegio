package ProjetoColegio;

public class App {
    public static void main(String[] args) throws Exception {
        
        Visitante visitante1 = new Visitante();
        Aluno aluno1 = new Aluno();
       
        Professor professor1 = new Professor();
        Funcionario funcionario1 = new Funcionario();

        aluno1.apresentarPrograma();
        visitante1.setNome("George Serrado");
        visitante1.setIdade(21);
        visitante1.setSexo("M");

        visitante1.statusViitante();

        aluno1.setNome("Pedro Balbino");
        aluno1.setCurso("Portugues");
        aluno1.setMatricula(00243);
        aluno1.setCursando(false);
        aluno1.setIdade(41);
        aluno1.setSexo("M");
        
        aluno1.statusAluno();
        aluno1.pagarMensalidade();
        
        Bolsista bolsista1 = new Bolsista();
        bolsista1.setNome("Jubileu Fernandes");
        bolsista1.setCurso("Matemática");
        bolsista1.setMatricula(0454);
        bolsista1.setCursando(true);
        bolsista1.setIdade(21);
        bolsista1.setSexo("M");
        bolsista1.setPercentualBolsa("20%");

        bolsista1.statusBolsista();
        bolsista1.pagarMensalidade();

        aluno1.fazerAniversario();

        funcionario1.setNome("Fabiana");
        funcionario1.setSetor("Desenvolvimento de Software");
        funcionario1.setAtivo(true);
        funcionario1.setSexo("M");
        funcionario1.setIdade(32);
        funcionario1.statusFuncionario();
        funcionario1.avisoFerias();

        professor1.setNome("Carol");
        professor1.setEspecialidade("Matemática");
        professor1.setIdade(55);
        professor1.setSexo("F");
        professor1.setSalario(2500.00);
        professor1.statusProfessor();
        
    }
}
