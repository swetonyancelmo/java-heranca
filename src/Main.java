import dominio.Estagiario;
import dominio.Funcionario;
import dominio.Gerente;
import dominio.Programador;


public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
                new Gerente("Juca", "123.456.789-90", 5000, "Desenvolvimento", 500),
                new Programador("Susuca Dev", "000-289-221-11", 9000, "Java"),
                new Estagiario("Swetony", "580-982-445-72", 3000, 12)
        };

        for (Funcionario funcionario : funcionarios){
            System.out.println("----------------------");
            funcionario.exibirDados();
        }
    }
}