package dominio;

public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, String cpf, double salario, String linguagem) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do programador: " + getNome());
        System.out.println("CPF do programador: " + getCpf());
        System.out.println("Salário do programador: " + getSalario());
        System.out.println("Linguagem de programação: " + getLinguagem());
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
