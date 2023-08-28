package ProjetoColegio;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;
    
    public void receberAumento(double aumento){
         this.salario = this.salario + aumento;
    }
    
    public void statusProfessor(){
        System.out.println("\nNome do Professor: "+ this.getNome());
        System.out.println("Especialidade do Professor: "+ this.getEspecialidade());
        System.out.println("Salário: R$"+ this.getSalario());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Sexo: "+ this.getSexo()+"\n");
    }
    
    
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    
}
