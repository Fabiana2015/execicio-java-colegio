package ProjetoColegio;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void apresentarPrograma(){

            System.out.println(" ");
            System.out.println("Apresentacao do Projeto:");
            System.out.println("-  -  -  -  -  -  -  -");
            System.out.println("Este e um sistema de um colégio.");
            System.out.println("Com este sistema voce pode cadastrar alunos bolsistas e não bolsistas, \n"+
                    "professores, funcionários e visitantes." +"\nVerificar o status de cada um deles, definir desconto dos bolsistas,"+"\npagar a mensalidade com o desconto ou não," + "\nconceder aumento aos professores, colocar um funcionário de férias ou chama-lo ao trabalho."+"\nE ainda mandar menssagens no aniverario de cada cadastrado.");
            System.out.println("-  -  -  -  -  -  -  -");
    }

    public final void fazerAniversario(){
        this.idade = idade+1;
        System.out.println("Mensagem especial para: " + this.getNome()+"\n");
        System.out.println("- | - | - | - | - | - | - | - | - | -");
        System.out.println(" ");
        System.out.println("F E L I Z   A N I V E R S A R I O! !");
         System.out.println(" ");
        System.out.println("- | - | - | - | - | - | - | - | - | -");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
