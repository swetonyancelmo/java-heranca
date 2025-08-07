package dominio;

public class Estagiario extends Funcionario {
    private int duracaoContrato;

    public Estagiario(String nome, String cpf, double salario, int duracaoContrato) {
        super(nome, cpf, salario);
        this.duracaoContrato = duracaoContrato;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do estagiário: " + getNome());
        System.out.println("CPF do estagiário: " + getCpf());
        System.out.println("Salário do estagiário: " + getSalario());
        System.out.println("Duração do contrato: " + getDuracaoContrato());
    }

    public int getDuracaoContrato() {
        return duracaoContrato;
    }

    public void setDuracaoContrato(int duracaoContrato) {
        this.duracaoContrato = duracaoContrato;
    }
}
