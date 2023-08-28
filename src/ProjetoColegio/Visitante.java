package ProjetoColegio;

public class Visitante extends Pessoa{
    
    public void statusViitante(){
        System.out.println("\nNome do Visitante: "+ this.getNome());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Sexo: "+ this.getSexo()+"\n");
    }


}
