package ProjetoColegio;

public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean ativo;

    public void statusFuncionario(){
        System.out.println("\nNome do Funcionário: "+ this.getNome());
        System.out.println("Setor: "+ this.getSetor());
        System.out.println("Funcionário Ativo: "+ this.getAtivo());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Sexo: "+ this.getSexo()+"\n");
    }
    public void avisoFerias(){
        if(getAtivo()){
            System.out.println(this.getNome()+", você entrará de férias este mês.");
        }else{
            System.out.println(this.getNome()+", você voltara das férias proximo dia util.");
        }
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
}
