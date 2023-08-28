package ProjetoColegio;

public class Bolsista extends Aluno{
    
    private String percentualBolsa;

    public void statusBolsista(){
        System.out.println("\nNome do Aluno: "+ this.getNome());
        System.out.println("Matrícula: "+ this.getMatricula());
        System.out.println("Curso: "+ this.getCurso());
        System.out.println("Aluno Bolsista - Percentual da Bolsa: " + this.getPercentualBolsa());
        System.out.println("Matrícula Ativa: "+ this.getCursando());
        System.out.println("Idade: "+ this.getIdade());
        System.out.println("Sexo: "+ this.getSexo()+"\n");
    }

    public void renovarBolsa(){
        System.out.println("Renovada bolsa do aluno" + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista."+
        "\nDesconto no pagamento de "+ this.getPercentualBolsa()+"."+"\nMensalidade paga.\n");

    }

    public String getPercentualBolsa() {
        return percentualBolsa;
    }

    public void setPercentualBolsa(String percentualBolsa) {
        this.percentualBolsa = percentualBolsa;
    }
}
