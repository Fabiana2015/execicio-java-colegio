package ProjetoColegio;

public class Aluno extends Pessoa{
    
    private int matricula;
    private String curso;
    private boolean cursando;

    public void statusAluno(){
        System.out.println("\nNome do Aluno: "+ this.getNome());
        System.out.println("Matrícula: "+ this.getMatricula());
        System.out.println("Curso: "+ this.getCurso());
        System.out.println("Matrícula Ativa: "+ this.getCursando());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Sexo: "+ this.getSexo()+"\n");
    }

    public void cancelarMatricula(){
        System.out.println("Matricula Cancelada.");
        this.setCursando(false);
    }

    public void pagarMensalidade(){
        System.out.println("Mensalidadedo do aluno "+ this.getNome()+ " paga.\n" );
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public boolean getCursando() {
        return cursando;
    }
    public void setCursando(boolean cursando) {
        this.cursando = cursando;
    }

    
}
