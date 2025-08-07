package dominio;

public class Gerente extends Funcionario {
    private String setor;
    private double bonificacao;

    public Gerente(String nome, String cpf, double salario, String setor, double bonificacao) {
        super(nome, cpf, salario);
        this.setor = setor;
        this.bonificacao = bonificacao;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do gerente: " + getNome());
        System.out.println("CPF do gerente: " + getCpf());
        System.out.println("Salário do gerente: " + getSalario());
        System.out.println("Setor do gerente: " + getSetor());
        System.out.println("Bonificação do gerente: " + getBonificacao());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
